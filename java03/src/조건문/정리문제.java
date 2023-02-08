package 조건문;

import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// 1번.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요! ");
		String id = sc.next();
		System.out.print("비밀번호를 입력해주세요! ");
		String pw = sc.next();
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

		// 2번.
		System.out.print("사과 구매 갯수를 입력해주세요! ");
		int apple = sc.nextInt();
		System.out.print("사과 한 개당 가격을 입력해주세요! ");
		int appleMoney = sc.nextInt();
		System.out.print("딸기 구매 갯수를 입력해주세요! ");
		int berry = sc.nextInt();
		System.out.print("딸기 한 개당 가격을 입력해주세요! ");
		int berryMoney = sc.nextInt();
		System.out.println("사과 구매 가격은 " + (apple * appleMoney) + "원입니다.");
		System.out.println("딸기 구매 가격은 " + (berry * berryMoney) + "원입니다.");
		System.out.println("전체 구매 가격은 " + (apple * appleMoney + berry * berryMoney) + "원입니다.");

		// 3번.
		System.out.print("시작 값을 입력해주세요! ");
		int start = sc.nextInt();
		System.out.print("종료 값을 입력해주세요! ");
		int finish = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= finish; i++) {
			sum += i;
		}
		System.out.println("시작 값부터 종료 값까지 모두 더한 값은 " + sum + "입니다.");

		// 4번.
		System.out.print("시작 값을 입력해주세요! ");
		int start2 = sc.nextInt();
		System.out.print("종료 값을 입력해주세요! ");
		int finish2 = sc.nextInt();
		System.out.print("점프 값을 입력해주세요! ");
		int jump2 = sc.nextInt();
		int sum2 = 0;
		for (int i = start2; i <= finish2; i += jump2) {
			if (sum2 > 100) {
				break; // for문 종료!
			}
			sum2 += i;
		}
		System.out.println("시작 값부터 종료 값까지 점프 값만큼 증가하면서 더한 값은 " + sum2 + "입니다.");

		sc.close();
	}

}
