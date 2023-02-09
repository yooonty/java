package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// 1번.
		int[] arr = new int[5]; // 전체 만들어지는 변수의 갯수는 7개
		// 2번.
		System.out.println("배열의 크기: " + arr.length);
		// 3번.
		arr[0] = 100;
		System.out.println("배열의 첫번째 값: " + arr[0]);
		// 4번.
		arr[4] = 500;
		System.out.println("배열의 마지막 값: " + arr[4]);
		// 5번.
		arr[2] = 200;
		System.out.println("배열의 세번째 값: " + arr[2]);
		// 6번.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		// 7번.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + ": " + arr[i] + " ");
		}
		System.out.println("");
		// 8번.
	}

}
