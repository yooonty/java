package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2; // static으로 선언된 함수에서 사용하기 위해서는 변수도 static

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.26, 8.37 };

		JFrame f = new JFrame("영화 앨범");
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.black);

		Font font = new Font("궁서", Font.BOLD, 40); // 객체생성을 하는데, 특정한 입력값을 입력하지 않으면 못만들게 할 수 있음.
		Font font2 = new Font("궁서", Font.BOLD, 40); // 객체생성을 하는데, 특정한 입력값을 입력하지 않으면 못만들게 할 수 있음.

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setFont(font);
		top.setForeground(Color.white);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setHorizontalAlignment(0);
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		// String.valueOf() : int, double, .... => String으로 변환
		// int + ""
		// Integer.parse() : double, String, .... => int으로 변환
		// Double.parse() : int, String, .... => double으로 변환
		JLabel under = new JLabel(jumsu[2] + "점");
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.white);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton(" <<");
		left.setFont(font2);
		left.setBackground(Color.black);
		left.setForeground(Color.white);
		left.setBorder(null);
		f.add(left, BorderLayout.WEST);

		// 액션처리 하는 방법
		// 1.액션기능을 add
		// 2.클릭액션이 있을 때 처리할 부품 생성
		// 3.클릭액션이 있을 때 어떻게 처리할지 코딩
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
					top.setText(title[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
					under.setText(jumsu[index] + "점");
				} else {
					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다!");
				}
			}
		});

		JButton right = new JButton(">> ");
		right.setFont(font2);
		right.setBackground(Color.black);
		right.setForeground(Color.white);
		right.setBorder(null);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < title.length - 1) {
					index++;
					top.setText(title[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
					under.setText(jumsu[index] + "점");
				} else {
					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다!");
				}
			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
