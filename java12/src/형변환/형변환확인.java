package 형변환;

import java.util.ArrayList;

public class 형변환확인 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();

		// 업캐스팅
		me.add(1000); // Object <-업캐스팅 -Integer <-오토박싱- int
		me.add(189.1); // Object <- Double <- double
		me.add(false); // Object <- Boolean <- boolean
		me.add('남'); // Object <- Character <- char

		// ArrayList는 toString()이 재정의
		// 참조형이기 때문에 원래 주소가 프린트 되어야함.
		// 주소가 가르키는 값들을 String으로 만들어 프린트하도록 재정의.
		System.out.println(me);

		// 다운캐스팅
		int money = (Integer) me.get(0); // int <-오토언박싱- Integer <- 다운캐스팅-Object
		double height = (Double) me.get(1); // double <- Double <- Object
		boolean bf = (Boolean) me.get(2); // boolean <- Boolean <- Object
		char gender = (Character) me.get(3); // char <- Character <- Object

		System.out.println(money + 1000);
		System.out.println(height + 10);
		if (bf) {
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		if (gender == '남') {
			System.out.println("주민번호는 1,3");
		} else {
			System.out.println("주민번호는 2,4");
		}

	}

}
