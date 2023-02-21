package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		// 카카오페이 코드
		String[] company = { "카카오페이", "대한항공", "현대차" };
		String[] code = { "377300", "003490", "005380" };
		String finance = "https://finance.naver.com/item/main.naver?code=";
		Connection con = null; // 로컬변수 초기화! 수동으로!
		Document doc = null; // 로컬변수 초기화! 수동으로!

		try {
			for (int i = 0; i < company.length; i++) {
				System.out.println(company[i]);
				con = Jsoup.connect(finance + code[i]);
				doc = con.get();
				// <span class="blind">
				Elements list = doc.select("span.blind");

				Element tag2 = list.get(12);
				String today = tag2.text();
				System.out.println("현재가: " + today);

				Element tag3 = list.get(16);
				String high = tag3.text();
				System.out.println("고가: " + high);

				Element tag4 = list.get(20);
				String low = tag4.text();
				System.out.println("저가: " + low);

				Element tag5 = list.get(18);
				String volume = tag5.text();
				System.out.println("거래량: " + volume);

				Element tag6 = list.get(21);
				String amount = tag6.text();
				System.out.println("거래대금: " + amount + "백만");
				System.out.println("-------------------------------------------------------------");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}