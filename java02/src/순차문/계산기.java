package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품 10개 => RAM에 부품을 만들어 넣어놓자.
		// JFrame, ImageIcon, JLabel 3개
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("3.jpg");
		JLabel label1 = new JLabel();
		label1.setIcon(icon);

		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel("숫자2");
		// label3.setText("숫자2");

		// JTextField 2개
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		// Font, FlowLayout
		Font font = new Font("궁서", 1, 20);
		FlowLayout layout = new FlowLayout();
		// JButton
		JButton btn1 = new JButton();
		btn1.setText("+");
		JButton btn2 = new JButton();
		btn2.setText("-");
		JButton btn3 = new JButton();
		btn3.setText("*");
		JButton btn4 = new JButton();
		btn4.setText("/");

		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn4.setFont(font);

		frame.setSize(500, 500);
		frame.setLayout(layout);
		frame.add(label1);
		frame.add(label2);
		frame.add(text1);
		frame.add(label3);
		frame.add(text2);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);

		label2.setForeground(Color.blue);
		label3.setForeground(Color.blue);
		text1.setBackground(Color.gray);
		text2.setBackground(Color.gray);
		btn1.setForeground(Color.blue);
		btn2.setForeground(Color.blue);
		btn3.setForeground(Color.blue);
		btn4.setForeground(Color.blue);

		// 위에 있는 설정그대로 frame을 보여주라! 맨아래 써줘야함
		frame.setVisible(true);
	}

}