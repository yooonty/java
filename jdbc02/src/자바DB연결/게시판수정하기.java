package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no -> title -> content -> writer 순으로 입력하세요.");
		int no = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();

		BbsDAO dao = new BbsDAO();
		dao.update(no, title, content, writer);

		sc.close();
	}

}
