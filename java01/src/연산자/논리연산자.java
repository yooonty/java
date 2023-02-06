package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {

		int id = 1111;
		int id2 = 2222;

		int pw = 3333;
		int pw2 = 3333;

		System.out.println("아이디가 동일한지 비교 " + (id == id2));
		System.out.println("패스워드가 동일한지 비교 " + (pw == pw2));
		// &&, and조건, 두 조건이 모두 맞아야 맞다고 판단
		// 로그인 처리!
		System.out.println(id == id2 && pw == pw2);

		int mem1 = 111;
		int mem2 = 222;
		// ||, or조건, 조건 중에서 하나만 맞으면 맞다라고 판단
		System.out.println(mem1 == 111 || mem2 == 111);
	}
}