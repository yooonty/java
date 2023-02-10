package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] jumsu = new int[999];
		Random r = new Random();
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(5) + 1;
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}
