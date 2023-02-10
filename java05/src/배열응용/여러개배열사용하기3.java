package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];
		int count = 0;// 작년과 올해 가고 싶었던 곳의 우선순위가 동일한 곳의 개수;

		for (int i = 0; i < lastYear.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 입력>>");
			lastYear[i] = sc.next();
		}
		for (int i = 0; i < thisYear.length; i++) {
			System.out.print("올해에 가고 싶은 곳 입력>>");
			thisYear[i] = sc.next();
		}
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳의 우선순위가 동일한 곳: " + count + "곳");
		sc.close();
	}

}