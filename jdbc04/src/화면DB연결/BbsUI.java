package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BbsDAO;

public class BbsUI {

	public void open() {
		// public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		f.setTitle("나의 회원가입 화면");
		f.setSize(320, 700);
		f.setLayout(flow);

		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("-------------");
		JLabel l3 = new JLabel("게시판 id");
		JLabel l4 = new JLabel("게시판 제목");
		JLabel l5 = new JLabel("게시판 내용");
		JLabel l6 = new JLabel("게시판 작성자");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("게시물 작성");
		JButton b2 = new JButton("게시물 삭제");
		JButton b3 = new JButton("게시물 수정");
		JButton b4 = new JButton("게시물 검색");

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText();
				int no = Integer.parseInt(num);
				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(no);
				if (bag != null) {
					System.out.println(bag);
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setForeground(Color.pink);
					t3.setForeground(Color.pink);
					t4.setForeground(Color.pink);
				} else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}

			}
		});
		Font font = new Font("궁서", Font.BOLD, 30);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(l4);
		f.add(t2);
		f.add(l5);
		f.add(t3);
		f.add(l6);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.getContentPane().setBackground(new Color(204, 229, 255));
		b1.setBackground(Color.pink); // 배경색
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);

		f.setVisible(true);

	}

}
