package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 기본 순차문: 입력-->처리-->출력
		// 입력-> 부품사용, 망치같은 언제나 바로 사용할 수 있는것! 사용해보자!
		String height = JOptionPane.showInputDialog("신장을 입력하세요");
		String weight = JOptionPane.showInputDialog("체중을 입력하세요");

		// 처리-> 숫자 더하기 연산
		// String을 int로 변경해주어야 함.

		double meter = Double.parseDouble(height) / 100;
		double bmi = Integer.parseInt(weight) / (meter * meter);

		// 출력-> 화면에 보이고 싶음.
		System.out.println(bmi);
		JOptionPane.showMessageDialog(null, bmi);
	}

}
