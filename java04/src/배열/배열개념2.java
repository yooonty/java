package 배열;

public class 배열개념2 {

	public static void main(String[] args) {
		// 1번.
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };
		// 2번.
		System.out.println("첫번째 값: " + week[0]);
		System.out.println("두번째 값: " + week[1]);
		// 3번.
		System.out.println("week배열의 데이터 수: " + week.length);
		// 4번.
		week[2] = 10;
		week[4] = 12;
		// 5번.
		System.out.println("세번째 값: " + week[2]);
		System.out.println("다섯번째 값: " + week[4]);
		System.out.println("-----------------------");
		// 6번.
		int[] tour = new int[4];
		// 7번.
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("첫번째 값: " + tour[0]);
		System.out.println("세번째 값: " + tour[2]);
		// 8번.
		System.out.println("tour배열의 데이터 수: " + tour.length);

	}

}
