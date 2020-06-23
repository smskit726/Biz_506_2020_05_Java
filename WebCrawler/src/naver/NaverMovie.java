package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie {
	public static void main(String[] args) throws IOException {

		int pageNum = 1;
		int cnt = 0;
		String pageValue = "";
		String prePageValue = "";
		String score = "";
		String comment = "";
		String writer = "";
		String regDt = "";

		while (true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page="
					+ pageNum;
			Document doc = Jsoup.connect(url).get();
			pageValue = doc.select("input#page").attr("value");

			Elements replyList = doc.select("div.score_result > ul > li");
			
			if(!pageValue.equals(prePageValue)) {
				prePageValue = pageValue;
			}else {
				break;
			}
			
			for (Element reply : replyList) {
				score = reply.select("div.star_score em").text();
				comment = reply.select("div.score_reple > p").text();

				int writerIndex;
				writer = reply.select("div.score_reple > dl > dt > em").get(0).text();
				writerIndex = writer.lastIndexOf("(");

				if (writerIndex != -1) {
					writer = writer.substring(0, writerIndex);
				}

				int regDtIndex = 0;
				regDt = reply.select("div.score_reple > dl > dt > em").get(1).text();
				regDtIndex = regDt.lastIndexOf(" ");
				regDt = regDt.substring(0, regDtIndex);

				System.out.println(
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("▦▦ 평  점 : " + score);
				System.out.println("▦▦ 댓  글 : " + comment);
				System.out.println("▦▦ 작성자 : " + writer);
				System.out.println("▦▦ 등록일 : " + regDt);
				
				cnt++;
			}
			pageNum+=1;
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.printf("총 %d 건을 수집하였습니다.",cnt);
	}
}
