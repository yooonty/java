package 확인문제;

public class 문제풀이4 {

	public static void main(String[] args) {
		char skill = '하';
		int backNumber = 6;
		double year = 3.5;
		boolean interesting = true;
		String hobby = "축구";

		String result1 = "저의 취미는 " + hobby + "이며," + year + "년동안 해왔고 실력은 " + skill + "입니다. ";
		String result2 = "등번호는 " + backNumber + "이며, 흥미도는 " + interesting + "입니다.";

		System.out.println(result1);
		System.out.println(result2);
	}

}
