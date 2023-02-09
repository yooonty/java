package 제어문문제;

import java.util.Scanner;

public class 인기투표 {
	public static void main(String[] args) {
		// 누적시키는 변수는 반복문 안에 넣지 않는다!
		// new Scanner() 반복문 안에 넣지 않는다!
		// 영화예매좌석 new JButton(); 반복문 안에 넣는다!
		// 입력값4인지 체크해주는 코드? 조건문 안에 첫번째 조건으로!
		Scanner sc = new Scanner(System.in);
		int data = 0; // 입력 값
		int iu = 0; // 아이유 투표 누적 변수
		int bts = 0; // 방탄 투표 누적 변수
		int jeans = 0; // 뉴진스 투표 누적 변수

		System.out.println("인기투표 시스템\n=============");
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			data = sc.nextInt(); // 입력 받기
			if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				break; // 반복문 종료.
			} else {
				if (data == 1) {
					iu++;
				} else if (data == 2) {
					bts++;
				} else if (data == 3) {
					jeans++;
				} else {
					System.out.println("해당 번호가 없습니다.");
				}
			}
		}
		System.out.println("-------------");
		System.out.println("아이유: " + iu + "표");
		System.out.println("방탄: " + bts + "표");
		System.out.println("뉴진스: " + jeans + "표");
		System.out.println("-------------");

		sc.close();

	}
}