package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		// 인기투표해봅시다!
		// 1)아이유 2)유재석 3)BTS
		int iu = 0;
		int jeans = 0;
		int bts = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("누구를 좋아하나요?? 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				jeans++;
			} else if (data.equals("3")) {
				bts++;
			}
		}

		System.out.println("아이유를 좋아하는 사람? " + iu + "명");
		System.out.println("뉴진스를 좋아하는 사람? " + jeans + "명");
		System.out.println("bts를 좋아하는 사람? " + bts + "명");
	}

}
