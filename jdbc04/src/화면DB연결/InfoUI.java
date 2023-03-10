package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoUI {

	public void open(BookVO bag) {
		System.out.println(bag);
		// public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		f.setTitle("책정보 화면");
		f.setSize(1250, 600);
		f.setLayout(flow);

		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("<책 제목>");
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel("<저자>");
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel("<기본정보>");
		JLabel l7 = new JLabel();
		JLabel l8 = new JLabel("<목차>");
		JLabel l9 = new JLabel();
		JLabel l10 = new JLabel("<출판사 제공 책 소개>");
		JLabel l11 = new JLabel();

		JButton b1 = new JButton("책정보 수정");
		JButton b2 = new JButton("평가하기");

		ImageIcon icon = new ImageIcon(bag.getImg());
		Font font = new Font("궁서", Font.BOLD, 30);
		Font font2 = new Font("", Font.PLAIN, 15);

		l1.setIcon(icon);
		l3.setText(bag.getTitle());
		l5.setText(bag.getWriter());
		l7.setText(bag.getInfo());
		l9.setText(bag.getContent());
		l11.setText(bag.getPublisher());

		l2.setFont(font);
		l3.setFont(font2);
		l4.setFont(font);
		l5.setFont(font2);
		l6.setFont(font);
		l7.setFont(font2);
		l8.setFont(font);
		l9.setFont(font2);
		l10.setFont(font);
		l11.setFont(font2);
		b1.setFont(font);
		b2.setFont(font);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(b1);
		f.add(b2);

		f.getContentPane().setBackground(new Color(204, 229, 255));
		b1.setBackground(Color.pink); // 배경색
		b2.setBackground(Color.pink);

		f.setVisible(true);

	}

}
