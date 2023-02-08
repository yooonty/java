package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; // 숫자맞추기를 해봅시다.
		int me = 88; // 내가 시도한 값

		// 조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		if (me == target) { // true
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		// if는 조건이 만족하면 처리하고 더이상 실행되지 않아요!
		// if문은 자체 break기능이 있음.

		// switch case는 자체 braek이 없음.
		// 내가 멈추고 싶은 곳에 break를 써주어야 함.
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답입니다!");
			break;
		case "신나":
		case "놀자":
		case "나가자":
			System.out.println("오답입니다!");
			break;
		default: // 위의 조건이 다 아닐때 실행하고 싶은 내용이 있으면 default에 넣어줌.
			System.out.println("그만해!");
			break;
		}
	}

}
