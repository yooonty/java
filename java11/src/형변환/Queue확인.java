package 형변환;

import java.util.LinkedList;

public class Queue확인 {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		queue.add("국어");
		queue.add("수학");
		queue.add("영어");
		queue.add("컴퓨터");
		System.out.println(queue);
		for (int i = 0; i < 3; i++) {
			queue.remove();
			System.out.println((i + 1) + "일차 시험본 후 남은 과목:" + queue);
		}
	}

}
