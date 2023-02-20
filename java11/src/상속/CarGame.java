package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		new CarGame();

	}

	public CarGame() {
		setTitle("나의 자동차 경주게임");
		setSize(700, 600);
		setLayout(null);
		MyThread2 car1 = new MyThread2("car01.png", 100, 0);
		MyThread2 car2 = new MyThread2("car02.png", 100, 150);
		MyThread2 car3 = new MyThread2("car03.png", 100, 300);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	public class MyThread2 extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread2(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150); // jframe에 붙은 위치 지정
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x를 늘려주는 것.
			int delay = 1000;
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int moveX = r.nextInt(50);// 0~49
				int moveY = r.nextInt(50) - 25;// -25~24
				x += moveX;
				y += moveY;
				if (y < 0 || y > 600) {
					x = 100;
					y = 150;
					delay = 2000;
				}
				label.setBounds(x, y, 150, 150); // 다시 위치 지정
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
