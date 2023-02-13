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

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(850, 850);
		f.getContentPane().setBackground(Color.yellow);
		// 배치해주는 부품- FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 추가한 순서대로 f에 붙는다.

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		// 반복해서 f에 add해주세요.
		Font font = new Font("궁서", Font.BOLD, 20);
		JButton[] btn = new JButton[200];
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);
		// 예약 여부를 저장하는 배열을 만들어 줍시다.!
		int[] reservation = new int[btn.length]; // {0,0,0,0,0,0,0,..}
		// 각 자리에 저장된 값이 0이면 아직 예약 안되어있음. 예약되면 1로 바꿈!
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + 1 + "");
			btn[i].setFont(font);
			btn[i].setBackground(Color.darkGray);
			btn[i].setForeground(Color.white);
			f.add(btn[i]);
			// 버튼에 액션 기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭햇을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					int num = Integer.parseInt(text);
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약 가능!

					if (reservation[num - 1] == 0) {
						reservation[num - 1] = 1;
						result.setText(text + "번 예약완료.");
						btn[num - 1].setText("예약");
						btn[num - 1].setEnabled(false); // 버튼 비활성화!

					} else {
						result.setText("예약불가");
					}
				}
			});
		}

		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setFont(font);
		total.setBackground(Color.orange);
		total.setForeground(Color.blue);

		total.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌.
				// 영화예매비 1장당 1만원, 결제금액 프린트
				int count = 0;
				for (int x : reservation) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "티켓 개수: " + count + "개\n총 예매비: " + (count * 10000) + "원");

			}
		});

		f.add(total);
		// 맨 끝에 있어야 함.
		f.setVisible(true);
	}

}
