package 조건문;

import javax.swing.JOptionPane;

public class if문7 {

	public static void main(String[] args) {
		// 1번
		String code = JOptionPane.showInputDialog("암호를 대시오.");
		if (code.equals("pass")) {
			System.out.println("들어오세요!");
		} else {
			System.out.println("나가세요!");
		}

		// 2번
		String menu = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면,라면,회)에서 선택.");
		if (menu.equals("자장면")) {
			System.out.println("중국집으로 가요!");
		} else if (menu.equals("라면")) {
			System.out.println("분식집으로 가요!");
		} else if (menu.equals("회")) {
			System.out.println("횟집으로 가요!");
		} else {
			System.out.println("그냥 안먹어요!");
		}

		// 3번
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요-2");
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);

		if (num1 > num2) {
			System.out.println("첫번째 정수가 더 큽니다!");
		} else if (num1 < num2) {
			System.out.println("두번째 정수가 더 큽니다!");
		} else {
			System.out.println("두 정수가 같습니다!");
		}

		// 4번
		String employNumber = "A100EX";
		char department = employNumber.charAt(0);
		switch (department) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
		}
	}
}
