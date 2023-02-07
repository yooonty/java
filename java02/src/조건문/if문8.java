package 조건문;

import javax.swing.JOptionPane;

public class if문8 {

	public static void main(String[] args) {
		// 추가문제
		// 1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String data1 = JOptionPane.showInputDialog("첫번째 수를 입력하세요!");
		String data2 = JOptionPane.showInputDialog("두번째 수를 입력하세요!");
		String data3 = JOptionPane.showInputDialog("사칙연산자를 입력하세요!");

		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);

		switch (data3) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}

		// 2. 두 수를 입력받아 정수로 변환하여 정수변수에 저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		String input1 = JOptionPane.showInputDialog("첫번째 수를 입력하세요!");
		String input2 = JOptionPane.showInputDialog("두번째 수를 입력하세요!");

		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		double result = a / (double) b;
		System.out.printf("나눗셈 결과: %.2f", result);
	}
}
