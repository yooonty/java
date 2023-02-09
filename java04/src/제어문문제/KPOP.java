package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KPOP {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		f.setSize(550, 950);
		f.setLayout(flow);

		JLabel title = new JLabel();
		title.setText("K-pop 인기 투표");
		JLabel first = new JLabel();
		first.setText("1. 아이유-라일락");
		JLabel fCount = new JLabel();
		fCount.setText("0표");
		JLabel second = new JLabel();
		second.setText("2. 뉴진스-ditto");
		JLabel sCount = new JLabel();
		sCount.setText("0표");
		JLabel third = new JLabel();
		third.setText("3. 뉴진스-hype boy");
		JLabel tCount = new JLabel();
		tCount.setText("0표");

		Font font = new Font("궁서", 1, 30);
		Font font2 = new Font("궁서", 1, 15);

		title.setFont(font);
		first.setFont(font2);
		fCount.setFont(font2);
		second.setFont(font2);
		sCount.setFont(font2);
		third.setFont(font2);
		tCount.setFont(font2);

		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();

		ImageIcon icon1 = new ImageIcon("lilac.jpg");
		ImageIcon icon2 = new ImageIcon("ditto.jpg");
		ImageIcon icon3 = new ImageIcon("hype.jpg");

		btn1.setIcon(icon1);
		btn2.setIcon(icon2);
		btn3.setIcon(icon3);

		f.add(title);
		f.add(btn1);
		f.add(first);
		f.add(fCount);
		f.add(btn2);
		f.add(second);
		f.add(sCount);
		f.add(btn3);
		f.add(third);
		f.add(tCount);

		// 버튼에 액션기능을 추가할 때는
		// 1. 액션기능 추가==> b1.addActionListener
		// 2. 버튼을 클릭했을 때 어떤 부품일 처리할지 부품 지정
		// ==> new ActionListener()
		// 3. 버튼을 클릭했을 때 처리 내용을 코딩
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// //처리할 내용을 씀
		// }

		btn1.addActionListener(new ActionListener() {
			int count1 = 0; // 첫번째 곡 투표 누적 변수

			@Override
			public void actionPerformed(ActionEvent e) {
				count1++;
				fCount.setText(count1 + "표");

			}
		});
		btn2.addActionListener(new ActionListener() {
			int count2 = 0; // 두번째 곡 투표 누적 변수

			@Override
			public void actionPerformed(ActionEvent e) {
				count2++;
				sCount.setText(count2 + "표");

			}
		});
		btn3.addActionListener(new ActionListener() {
			int count3 = 0; // 세번째 곡 투표 누적 변수

			@Override
			public void actionPerformed(ActionEvent e) {
				count3++;
				tCount.setText(count3 + "표");

			}
		});

		f.setVisible(true);

	}
}