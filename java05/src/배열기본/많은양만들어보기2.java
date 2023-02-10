package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}

		int sum = 0;
		int count = 0;
		for (int x : jumsu2) {
			System.out.println(x);
			if (x >= 15) {
				count++;
				sum += x;
			}
		}
		System.out.println("15이상인 수는 " + count + "개 입니다.");
		System.out.println("15이상인 수를 모두 합하면  " + sum + "입니다.");
	}

}
