package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public void finance(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			// select("a") : tag <a>
			// select(".code") : <a class="code">
			// select("#userId") : <a id="userId">
			doc = con.get();
			Elements company = doc.select(".wrap_company a");
			Element tag = company.get(0);
			String companyTxt = tag.text();
			System.out.println("회사명: " + companyTxt);

			System.out.println("코드: " + code);

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
			System.out.println("------------------------");

			FileWriter file = new FileWriter(code + ".txt");
			file.write("회사명: " + companyTxt + "\n");
			file.write("코드: " + code + "\n");
			file.write("현재가: " + today + "\n");
			file.write("고가: " + high + "\n");
			file.write("저가: " + low + "\n");
			file.write("거래량: " + volume + "\n");
			file.write("거래대금: " + amount + "백만\n");
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}