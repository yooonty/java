package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.MemberVO;

public class 회원1명검색 {

	public static void main(String[] args) {

		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 id를 입력하세요.");

		String id = sc.next();

		MemberDAO dao = new MemberDAO();
		MemberVO rs = dao.one(id);
		
		System.out.println(rs);
		
		sc.close();
	}

}