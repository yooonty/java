package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("극장예매시스템");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", Font.BOLD, 20);
		f.setSize(850, 850);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.lightGray);
		JButton[] btn = new JButton[200];
		JLabel result = new JLabel("결과 나오는 곳");
		result.setFont(font);
		int[] reservation = new int[btn.length];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + 1 + "");
			btn[i].setFont(font);
			btn[i].setBackground(Color.white);
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int num = Integer.parseInt(text);
					if (reservation[num - 1] == 0) {
						reservation[num - 1] = 1;
						result.setText(text + "번 예약완료.");
						btn[num - 1].setBackground(Color.DARK_GRAY);
						btn[num - 1].setText("예약");
						btn[num - 1].setEnabled(false);
					}
				}
			});
		}
		JButton total = new JButton("결제하기");
		total.setFont(font);
		total.setBackground(Color.yellow);
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : reservation) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "티켓 개수: " + count + "개\n총 예매비: " + (count * 10000) + "원");
			}
		});

		f.add(result);
		f.add(total);
		f.setVisible(true);
	}

}
