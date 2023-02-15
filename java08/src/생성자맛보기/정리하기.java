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

public class 정리하기 {

	static int index = 0;
	static int count = 0; // 0으로 자동 초기화, 전역변수!
	static int[] cafe = { 0, 0, 0 };
	final static int[] PRICE = { 3000, 4500, 3500 }; // final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {
		String[] menus = { " 에스프레소 ", " 아메리카노 ", " 카페라떼 " };
		String[] img = { "cafe1.png", "cafe2.png", "cafe3.png" };

		JFrame f = new JFrame("키오스크");
		FlowLayout flow = new FlowLayout();
		f.setSize(1000, 300);
		f.setLayout(flow);
		// f.getContentPane().setBackground(Color.orange);

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel[] labels = new JLabel[3];
		JButton[] btns = new JButton[3];
		ImageIcon[] icons = new ImageIcon[3];
		JLabel total = new JLabel("에스프레소: " + cafe[0] + "개, 아메리카노: " + cafe[1] + "개, 카페라떼: " + cafe[2] + "개");
		total.setFont(font);

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(menus[i]);
			icons[i] = new ImageIcon(img[i]);
			btns[i] = new JButton();
			btns[i].setIcon(icons[i]);
			labels[i].setFont(font);
			f.add(labels[i]);
			f.add(btns[i]);
		}
		for (int i = 0; i < btns.length; i++) {
			index = i;
			btns[i].addActionListener(new ActionListener() {
				int x = index;
				@Override
				public void actionPerformed(ActionEvent e) {
					cafe[x]++;
					total.setText("에스프레소: " + cafe[0] + "개, 아메리카노: " + cafe[1] + "개, 카페라떼: " + cafe[2] + "개");
				}
			});
		}

		f.add(total);
		f.setVisible(true);
	}

}
