package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; // length: 10
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
		x[0] = 10;
		x[1] = 20;

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\n---------------------------------");
		// 우리가족의 성별을 char[]로 저장, 프린트
		// 우리가족의 이름을 String[]로 저장, 프린트
		// 우리가족의 시력을 double[]로 저장, 프린트

		char[] gender = { '남', '여', '남', '남' };
		String[] name = { "윤1", "허", "윤2", "윤3" };
		double[] eye = { 1.0, 1.2, 1.3, 1.1 };
		boolean[] lunch = { true, true, true, false };

		for (int i = 0; i < 4; i++) {
			System.out.println(
					(i + 1) + ") 성별: " + gender[i] + ", 이름: " + name[i] + ", 시력: " + eye[i] + ", 점심여부: " + lunch[i]);
		}

	}

}
