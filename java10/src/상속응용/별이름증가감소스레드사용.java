package 상속응용;

public class 별이름증가감소스레드사용 {

	public static void main(String[] args) {
		별스레드 star = new 별스레드();
		이름스레드 name = new 이름스레드();
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();

		// 스레드 프로그램 시작
		감소.start();
		증가.start();
		star.start();
		name.start();
	}

}
