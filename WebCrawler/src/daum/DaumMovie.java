package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {

		int page = 1;
		int cnt = 0;
		String writer = "";
		int score = 0;
		String review = "";
		String regDt = "";

		while (true) {

			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;
			Document doc = Jsoup.connect(url).get();

			Elements replyList = doc.select("div.review_info");

			if (replyList.size() <= 0) {
				break;
			}

			for (Element reply : replyList) {
				writer = reply.select("em.link_profile").text();
				score = Integer.parseInt(reply.select("em.emph_grade").text());
				review = reply.select("p.desc_review").text();
				regDt = reply.select("span.info_append").text().substring(0,10);

				System.out.println(
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("▦▦ 작성자 : " + writer);
				System.out.println("▦▦ 평  점 : " + score);
				System.out.println("▦▦ 댓  글 : " + review);
				System.out.println("▦▦ 등록일 : " + regDt);
				cnt++;
			}
			page += 1;
		}

		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.printf("총 %d 건을 수집하였습니다.", cnt);
	}
}
