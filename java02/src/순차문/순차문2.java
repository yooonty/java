package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 기본 순차문: 입력-->처리-->출력
		// 입력-> 부품사용, 망치같은 언제나 바로 사용할 수 있는것! 사용해보자!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");

		// 처리-> 숫자 더하기 연산
		// String을 int로 변경해주어야 함.

		int result1 = Integer.parseInt(data1) + Integer.parseInt(data2);
		double result2 = Double.parseDouble(data1) + Double.parseDouble(data2);

		// 출력-> 화면에 보이고 싶음.
		System.out.println(result1);
		System.out.println(result2);
	}

}
