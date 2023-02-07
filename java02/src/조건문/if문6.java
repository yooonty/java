package 조건문;

import java.util.Date;

public class if문6 {

	public static void main(String[] args) {
		Date date = new Date();

		int year = date.getYear() + 1900;
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요. ");
		}

		int day = date.getDay();
		switch (day) {
		case 0:
		case 6:
			System.out.println("쉬~~~~~~~자!");
			break;
		default:
			System.out.println("열~~심히 공부하자!");
			break;
		}

		int month = date.getMonth() + 1;
		System.out.println(month + "월 입니다!");
		if (month == 2) {
			for (int i = 0; i < 28; i++) {
				System.out.print((i + 1) + " ");
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			for (int i = 0; i < 30; i++) {
				System.out.print((i + 1) + " ");
			}
		} else {
			for (int i = 0; i < 31; i++) {
				System.out.print((i + 1) + " ");
			}
		}
	}
}
