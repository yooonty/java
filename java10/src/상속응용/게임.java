package 상속응용;

public class 게임 {

	public static void main(String[] args) {
		무궁화꽃스레드 flower = new 무궁화꽃스레드();
		참가자스레드 player = new 참가자스레드();
//		이미지스레드 image = new 이미지스레드();

		flower.start();
		player.start();
		
	}

}
