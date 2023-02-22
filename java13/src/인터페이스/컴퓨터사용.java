package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		Computer com1 = new AppleComputer();
		BananaComputer com2 = new BananaComputer();

		com1.cpu();
		com1.ram();
		com1.그래픽카드();
		com2.cpu();
		com2.ram();
		com2.그래픽카드();

	}

}
