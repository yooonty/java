package 상속응용;

public class 무궁화꽃스레드 extends Thread {
	@Override
	public void run() {
		String[] images = { "무궁화", "꽃이", "피었습니다!" };
		for (int i = 0; i < images.length; i++) {
			System.out.println(images[i]);
			if (i == 2) {
				i = -1;
			}
			try {
				Thread.sleep(1000); // 1초재워라. ms(밀리세컨드)
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
