package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		// iu = iu + 1;
		// sum = sum + i;
		int sum = 0;
		// 숫자 누적
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);
		// 글자 누적
		String sum2 = ""; // String의 초기값은 ""
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 += (data + " ");
		}
		System.out.println(sum2);
	}

}
