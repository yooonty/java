package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		// 1번. 중복제거!! ==> set
		HashSet trip = new HashSet();
		trip.add("미국");
		trip.add("영국");
		trip.add("호주");
		trip.add("캐나다");
		trip.add("프랑스");
		System.out.println(trip);

		// 2번. 키+값으로 쌍으로 넣을 때는! ==> map
		HashMap house = new HashMap();
		house.put("안방", "TV");
		house.put("거실", "쇼파");
		house.put("부엌", "냉장고");
		house.put("현관", "신발");
		System.out.println(house);
		System.out.println(house.get("현관"));
		house.replace("거실", "책상");
		System.out.println(house);

		// 3번. 할 일 우선순위(순서) ==> list
		ArrayList doList = new ArrayList();
		doList.add("자바공부");
		doList.add("점심");
		doList.add("자바복습");
		doList.add("자바스터디");
		doList.add("쉬기");
		System.out.println(doList);
		System.out.println(doList.get(0));
		System.out.println(doList.get(doList.size() - 1));
		doList.set(1, "청소");
		System.out.println(doList);

		LinkedList todo = new LinkedList();
		todo.add("공부");
		todo.add("쇼핑");
		todo.add("운동");
		todo.add("장보기");
		todo.add("샤워");
		System.out.println(todo);
		System.out.println(todo.get(0));
		System.out.println(todo.get(todo.size() - 1));
		todo.set(1, "청소");
		System.out.println(todo);
	}

}
