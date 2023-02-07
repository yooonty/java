package 조건문;

import java.util.Date;

public class if문4 {

	public static void main(String[] args) {
		// Date - 년월일시분초, java.util.Date

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDay()); // 요일! 0부터 시작, 일요일!
		System.out.println(date.getHours());
		System.out.println(date.getYear() + 1900);

		int hour = date.getHours();
		// System.out.println(hour);

		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿애프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

		int month = date.getMonth() + 1;// 음력기준으로 나와서 +1 해주어야함.
		// System.out.println(month);
		switch (month) { // long, 실수는 비교 X/ char, String 비교O
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}

}
