package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartUI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog(null, "아이디를 입력하세요");
		String pw = JOptionPane.showInputDialog(null, "비밀번호를 입력하세요");
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setPw(pw);

		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공.");
			BbsUI bbs = new BbsUI();
			bbs.open();
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패.");
			MemberUI2 member = new MemberUI2();
			member.open();
		}

	}

}
