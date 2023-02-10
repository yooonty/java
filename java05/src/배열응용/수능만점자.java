package 배열응용;

import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		int[] exam = new int[10000];
		int perfect = 0;
		int bad = 0;
		int sum = 0;
		int count = 0;
		Random r = new Random(42);
		for (int i = 0; i < exam.length; i++) {
			exam[i] = r.nextInt(451);
			if (exam[i] == 450) {
				perfect++;
			} else if (exam[i] == 0) {
				bad++;
			}
			sum += exam[i];
		}
		System.out.println("만점자: " + perfect + "명");
		System.out.print("만점자 인덱스: ");
		for (int i = 0; i < exam.length; i++) {
			if (exam[i] == 450) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("0점자: " + bad + "명");
		
		double avg = (double) sum / exam.length;
		System.out.println("시험 평균: " + avg);
		for (int x : exam) {
			if (x <= avg + 50 && x >= avg - 50) {
				count++;
			}
		}
		System.out.println("평균보다 +-50점인 학생의 수는: " + count + "명");
	}

}
