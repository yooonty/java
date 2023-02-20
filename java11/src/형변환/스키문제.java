package 형변환;

import java.util.ArrayList;

public class 스키문제 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add(0, "박스키");
		ski.add(1, "송스키");
		ski.add(2, "김스키");
		ski.add(3, "정스키");
		ski.remove(1); // 2등 탈락
		System.out.print("수상자 명단: ");
		for (int i = 0; i < ski.size(); i++) {
			System.out.print(ski.get(i) + " ");
		}
//		for (Object obj : ski) {
//			System.out.println(obj);
//		}

		System.out.println(ski.contains("김연아"));

		ArrayList ski2 = new ArrayList();
		ski2.add("이스키");
		ski2.add("윤스키");
		ski2.add("강스키");
		ski.addAll(ski2); // 파괴형함수
		System.out.println(ski);
		System.out.println(ski2.isEmpty());
		ski2.clear(); // list 내용 전체 삭제!
		System.out.println(ski2);
	}

}
