package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 저장할지 미리 결정.
		// 선언!! 타입 변수명! ==> 변수(저장공간)이 생성
		int num = 100; // 정수 변수
		double num2 = 22.2; // 실수 변수
		char c = 'a'; // 글자 1글자==> ''
		boolean b = true; // true, false
		num = 200; // ok!
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자1개 값은 " + c);
		System.out.println("부울렌 값은 " + b);
	}

}
