package 상속응용;

//동시에 돌아가게 하는 부품은 Thread를 상속받아서 만들면
//내 부품은 동시에 돌아가는 클래스로 만들어진다.
public class 별스레드 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 5000; i++) {
			System.out.println(i + ": ★");
		}
	}
}
