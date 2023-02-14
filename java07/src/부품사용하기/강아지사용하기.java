package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.type = "푸들";
		d1.name = "흰둥이";
		d1.age = 2;
		System.out.println("d1의 종류: " + d1.type);
		System.out.println("d1의 이름: " + d1.name);
		System.out.println("d1의 나이: " + d1.age);

		강아지 d2 = new 강아지();
		d2.type = "비숑";
		d2.name = "뚱이";
		d2.age = 1;
		System.out.println("d2의 종류: " + d2.type);
		System.out.println("d2의 이름: " + d2.name);
		System.out.println("d2의 나이: " + d2.age);
		
		d1.간식을먹다();
		d2.산책하다();
	}

}
