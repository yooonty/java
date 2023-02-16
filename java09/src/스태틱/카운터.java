package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {

	static int i;

	public static void main(String[] args) {
		JFrame f = new JFrame("카운터");
		FlowLayout flow = new FlowLayout();
		f.setSize(400, 300);
		f.setLayout(flow);

		JLabel result = new JLabel(i + "");

		Font font1 = new Font("궁서", Font.BOLD, 20);
		Font font2 = new Font("궁서", Font.BOLD, 80);

		JButton plus = new JButton("1더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1빼기");

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				result.setText(i + "");
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i = 0;
				result.setText(i + "");
			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				result.setText(i + "");
			}
		});

		plus.setFont(font1);
		reset.setFont(font1);
		minus.setFont(font1);
		result.setFont(font2);
		
		plus.setBackground(Color.orange);
		minus.setBackground(Color.orange);
		reset.setBackground(Color.lightGray);
		result.setForeground(Color.red);
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(result);

		f.setVisible(true);
	}

}
