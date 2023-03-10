package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 자바DB연결.BookDAO;

public class BeforeUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setSize(500, 800);
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("책제목");
		JButton b1 = new JButton("책");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BookDAO dao = new BookDAO();
				InfoUI info = new InfoUI();
				BookVO bag = dao.one(2);
				info.open(bag);
			}
		});
		
		f.add(l1);
		f.add(b1);
		f.getContentPane().setBackground(new Color(204, 229, 255));
		f.setVisible(true);
	}

}
