package 상속응용;

//동시에 돌아가게 하는 부품은 Thread를 상속받아서 만들면
//내 부품은 동시에 돌아가는 클래스로 만들어진다.
public class 참가자스레드 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			if (i != 0) {
				System.out.println("--------------------");
				System.out.println("정지");
				System.out.println("--------------------");
			}

			try {
				Thread.sleep(3000); // 3초재워라.
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
