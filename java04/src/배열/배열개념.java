package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러 개의 데이터를 RAM에 저장해두고 CPU가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] jumsu = { 10, 20, 30, 40 };// length 만들어서 몇개인지 세서 값을 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]);// 첫번째
		System.out.println(jumsu[1]);// 두번째
		System.out.println(jumsu[2]);// 세번째
		System.out.println(jumsu[3]);// 네번째
		System.out.println("전체 개수: " + jumsu.length);// 이 주소가 가르키는 length변수

		jumsu[0] = 100;
		System.out.println(jumsu[0]);
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어 두고
		// 나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0]=200;
		System.out.println(jumsu2[0]);
		System.out.println(jumsu2[1]);
		System.out.println(jumsu2[2]);
		System.out.println(jumsu2[3]);
	}

}
