package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적
		int count3 = 0;// 1학기가 성적이 더 좋은 학생
		int count4 = 0;// 2학기가 성적이 더 좋은 학생

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
				if (n1[i] > n2[i]) { // 1학기가 더 큰 경우
					count3++;
					System.out.println("1학기 성적이 더 큰 학생: " + i);
				} else { // 2학기가 더 큰 경우
					count4++;
					System.out.println("2학기 성적이 더 큰 학생: " + i);
				}
			}
		}

		System.out.println("1-2학기 성적이 동일한 학생의 수: " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생의 수: " + count2 + "명");
		System.out.println("2학기에 성적이 오른 학생의 수: " + count4 + "명");
		System.out.println("1학기 성적이 더 좋은 학생의 수: " + count3 + "명");
	}

}