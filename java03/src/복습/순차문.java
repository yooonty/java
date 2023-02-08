package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 두 개의 숫자를 입력을 받아서 + 처리해서 출력
		// 프로그래밍은 손으로 치는 갑은 모두다 String으로 취급한다(문자열)
		// 램에 저장공간을 만드는 것 ==> 선언!
		// 선언할때 램에 저장공간인 변수가 만들어진다.
		// 데이터타입 변수명
		// 입력!
		String data1 = JOptionPane.showInputDialog("숫자1 입력하세요");
		String data2 = JOptionPane.showInputDialog("숫자2 입력하세요");

		// 처리!
		// 정수로 바꾸어서 처리를 하고 싶으면 프로그래머가 정수로 바꾸어주는 부품을 써서 처리를 해야함.
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);

		// 출력!
		// 자바언어는 정수와 정수의 연산의 결과는 무조건 정수!
		// 자바언어는 하나라도 실수이면 결과는 무조건 실수!
		System.out.println((double) num1 / num2);
		System.out.printf("%.3f", (double) num1 / num2);
		
	}

}
