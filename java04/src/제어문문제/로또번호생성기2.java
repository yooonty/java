package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {
	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		//r.nextInt(45) : 0~44
		Random r = new Random();// 싸앗값, seed값!
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 :" + (r.nextInt(45) + 1)); // 1~45
		}
		
		//2~10
		System.out.println("2부터 10사이 :" + (r.nextInt(9) + 2));
		
		//3~30
		System.out.println("3부터 30사이 :" + (r.nextInt(28) + 3));
		
		
		
	}
}