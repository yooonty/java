package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 키오스크 {

	static int count = 0; // 0으로 자동 초기화, 전역변수!
	static int[] food = { 0, 0, 0 };
	final static int PRICE1 = 5000; // final은 변경불가, 상수
	final static int PRICE2 = 4500; // final은 변경불가, 상수
	final static int PRICE3 = 3500; // final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {
		JFrame f = new JFrame("키오스크");
		FlowLayout flow = new FlowLayout();
		f.setSize(800, 800);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.orange);

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel text1 = new JLabel("개수:");
		JLabel text2 = new JLabel(count + "개");
		JLabel text3 = new JLabel();
		JLabel img = new JLabel();

		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);

		JButton btn1 = new JButton("크루아상");
		JButton btn2 = new JButton("바게트");
		JButton btn3 = new JButton("샌드위치");

		btn1.setBackground(Color.lightGray);
		btn2.setBackground(Color.lightGray);
		btn3.setBackground(Color.lightGray);
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);

		ImageIcon icon1 = new ImageIcon("b1.png");
		ImageIcon icon2 = new ImageIcon("b2.png");
		ImageIcon icon3 = new ImageIcon("b3.png");
		ImageIcon main = new ImageIcon("bakery.png");

		img.setIcon(main);
		text3.setText("결제금액: " + (food[0] * PRICE1 + food[1] * PRICE2 + food[2] * PRICE3) + "원");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				food[0]++;
				img.setIcon(icon1);
				f.setTitle("크로아상: " + food[0] + "개, 바게트: " + food[1] + "개, 샌드위치: " + food[2] + "개");
				text2.setText(count + "개");
				text3.setText("결제금액: " + (food[0] * PRICE1 + food[1] * PRICE2 + food[2] * PRICE3) + "원");
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				food[1]++;
				img.setIcon(icon2);
				f.setTitle("크로아상: " + food[0] + "개, 바게트: " + food[1] + "개, 샌드위치: " + food[2] + "개");
				text2.setText(count + "개");
				text3.setText("결제금액: " + (food[0] * PRICE1 + food[1] * PRICE2 + food[2] * PRICE3) + "원");
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				food[2]++;
				img.setIcon(icon3);
				f.setTitle("크로아상: " + food[0] + "개, 바게트: " + food[1] + "개, 샌드위치: " + food[2] + "개");
				text2.setText(count + "개");
				text3.setText("결제금액: " + (food[0] * PRICE1 + food[1] * PRICE2 + food[2] * PRICE3) + "원");
			}
		});

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(text1);
		f.add(text2);
		f.add(img);
		f.add(text3);

		f.setVisible(true);
	}

}
