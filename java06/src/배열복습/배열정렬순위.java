package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정령을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		// for: 입력용, 출력용, i활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;// 1~1000
		}
		// for-each: 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다.!
		// 입력이나 i값을 출력하지 못하지만 실무에서 많이 사용한다!
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 작-->큰(오름차순), 큰-->작(내림차순)
		// 오름차순
		Arrays.sort(jumsu); // 오름차순
		// sort(jumsu) ==> jumsu가 바뀌어버림(원본이 파괴) -- 파괴형 함수
		// parseInt(n) ==> ram에 저장된 n이 변경된 것은 아니다.(원본이 비파괴) -- 비파괴형 함수
		System.out.println("------------------------");

		// 정렬 후, 확인
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 정렬후, 최대값, 최소값을 프린트!
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]);

		// 상위30%, 인원3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 += jumsu[i];
		}
		System.out.println("상위 30%평균 : " + (sum30 / 3000.0));

		// 하위30%, 인원3000명, 높은 점수부터 3000개 추출
		int sum302 = 0;
		for (int i = 0; i < jumsu.length * 0.3; i++) {
			sum302 += jumsu[i];
		}
		System.out.println("하위 30%평균 : " + (sum302 / 3000.0));

	}
}
