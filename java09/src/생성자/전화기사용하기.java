package 생성자;


public class 전화기사용하기 {

	public static void main(String[] args) {
		// 전화기를 만들어보자. 2개를 만들어보자.
		전화기 tel1 = new 전화기();
		tel1.price = 1000;
		tel1.shape = "폴더";
		tel1.인터넷하다();
		System.out.println("tel1의 가격: " + tel1.price);
		System.out.println("tel1의 모양: " + tel1.shape);

		전화기 tel2 = new 전화기();
		tel2.price = 2000;
		tel2.shape = "슬라이드";
		System.out.println("tel2의 가격: " + tel2.price);
		System.out.println("tel2의 모양: " + tel2.shape);

	}
}
