package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		JButton b = new JButton("나를 눌러");
		b.addActionListener(new ActionListener() {
			// ActionLister는 인터페이스!
			// 따라서 new를 할 수 없지만, 구체적으로 구현을 하고는 사용할 수 있음. (익명클래스)
			// 따로 클래스를 만들지 않아도 되는 장점.
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리할 내용을 코딩!
				// 인터페이스에 반딋 actionPerformed()를
				// 쓰라고 규칙이 정해져 있어서 이름을 바꾸면 안됨
				System.out.println("버튼이 클릭되었음.");

			}
		});
		f.add(b);
		f.setVisible(true);
	}

}
