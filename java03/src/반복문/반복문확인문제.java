package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", 1, 50);
		f.setSize(350, 350);
		f.getContentPane().setBackground(Color.orange);
		f.setLayout(flow);
		JButton btn1 = new JButton();
		btn1.setText("별 10개");
		btn1.setFont(font);
		btn1.setForeground(Color.blue);
		btn1.setBackground(Color.green);
		JButton btn2 = new JButton();
		btn2.setText("커피*5");
		btn2.setFont(font);
		btn2.setForeground(Color.blue);
		btn2.setBackground(Color.pink);
		JButton btn3 = new JButton();
		btn3.setText("커피*우유3");
		btn3.setFont(font);
		btn3.setForeground(Color.blue);
		btn3.setBackground(Color.green);
		JButton btn4 = new JButton();
		btn4.setText("1:짱!");
		btn4.setFont(font);
		btn4.setForeground(Color.blue);
		btn4.setBackground(Color.pink);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		// 1.버튼에다가 액션기능을 추가하겠다고 설정. -- addActionListner
		// 2.클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩해주면 됨. -- addPerformed 
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내욧을 여기에 써주세요!
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내욧을 여기에 써주세요!
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내욧을 여기에 써주세요!
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내욧을 여기에 써주세요!
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ":짱!");
				}
			}
		});

		f.setVisible(true);

	}
}
