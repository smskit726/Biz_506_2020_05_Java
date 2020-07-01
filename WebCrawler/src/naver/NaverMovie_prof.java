package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie_prof {
	public static void main(String[] args) throws IOException {
		int page = 1;
		int cnt = 0;
		String prePage = "";
		String content = "";
		String writer = "";
		int score = 0;
		String regDt = "";
		
		while(true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page="+ page;
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.score_result li");
			String nowPage = doc.select("input#page").attr("value");
			
			if(nowPage.equals(prePage)) {
				break;
			}else{
				prePage = nowPage;
				
			}
			
			for(Element one : replyList) {
				content = one.select("div.score_reple > p > span").get(0).text();
				writer = one.select("div.score_reple a > span").get(0).text();
				score = Integer.parseInt(one.select("div.star_score > em").get(0).text()); // mongoDB를 통해 평균을 구할 수 있다. 따라서 정수형으로 변환시켜준다.
				regDt = one.select("div.score_reple em").get(1).text().substring(0,10);
				
				System.out.println(
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("▦▦ 평  점 : " + score);
				System.out.println("▦▦ 댓  글 : " + content);
				System.out.println("▦▦ 작성자 : " + writer);
				System.out.println("▦▦ 등록일 : " + regDt);
				cnt +=1;
			}
			page+=1;
		}
		System.out.println("총 " + cnt + "건 수집하였습니다.");
	}
}
