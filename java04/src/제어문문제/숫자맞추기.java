package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {
	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		Random r = new Random();
		int target = r.nextInt(10);
		int data = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("당신이 생각한 정답은?>> ");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다!");
				System.out.println("총 도전 횟수: " + count);
				System.out.println("프로그램을 종료합니다!");
				break;
			} else {
				System.out.println("오답입니다!");
				System.out.println("다시 시도해주세요!");
				if (data > target) {
					System.out.println("힌트)입력 값이 너무 커요!");
				} else {
					System.out.println("힌트)입력 값이 너무 작아요!");
				}
			}
		}

		sc.close();

	}
}