package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1번.
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력>> ");
			arr[i] = sc.nextInt();
		}
		System.out.println("첫번째 값과 세번째 값의 합: " + (arr[0] + arr[2]));

		// 2번.
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("문자열 입력>> ");
			arr2[i] = sc.next();
		}
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);

		sc.close();
	}

}
