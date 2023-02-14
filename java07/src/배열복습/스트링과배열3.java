package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String number = "    011-245-1234    ";
		String phone = number.trim();
		System.out.println(phone);
		String[] s = phone.split("-"); // -를 기준으로 문자열을 3개로 분리

		// 3번
		if (s[0].equals("011")) {
			System.out.println("SK");
		} else if (s[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		// 4번
		if (s[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		// 5번
		int len = 0;
		for (int i = 0; i < s.length; i++) {
			len += s[i].length();
		}
		if (len >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

	}

}
