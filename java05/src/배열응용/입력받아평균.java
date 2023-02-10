package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용!
		// 1.배열을 만들어주세요.
		int[] jumsu = new int[5];

		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문을 사용해야함.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.println(x + " ");
		}
		System.out.println();
		// 1.전체 합계구해서, 평균구해보세요.
		// 2.300이상되는 숫자만 찾아서, 합계를 구해보세요.
		// 3.심화문제, 300이상 되는 위치(index)가 어딜까? 프린트

		int sum = 0;
		int sum2 = 0;
		for (int x : jumsu) {
			sum += x;
			if (x >= 300) {
				sum2 += x;
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double) sum / jumsu.length);
		System.out.println("300이상 되는 숫자 합 : " + sum2);
		System.out.print("300이상 되는 index: ");
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.print(i + " ");
			}
		}
	
	}

}
