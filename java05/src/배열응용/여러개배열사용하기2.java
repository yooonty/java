package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count = 0; // 2학기 성적이 오른 학생 누적
		int count2 = 0; // 성적이 동일한 학생 누적
		int perfect = 0; // 2학기 100점인 학생의 index 저장
		int sum1 = 0; // 1학기 점수합
		int sum2 = 0; // 2학기 점수 합
		double avg1 = 0; // 1학기 점수 평균
		double avg2 = 0; // 2학기 점수 평균
		int goodTerm = 0; // 평균이 더 높은 학기
		int newJeans = 0; // 뉴진스 인덱스

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) { // 2학기 성적이 더 좋은지 비교
				count++;
			} else if (term1[i] == term2[i]) { // 1학기,2학기 성적이 같은지 비교
				count2++;
			}

			if (term2[i] == 100) { // 2학기 성적이 100점인지
				perfect = i;
			}
			sum1 += term1[i]; // 1학기 점수 누적
			sum2 += term2[i]; // 2학기 점수 누적
		}

		avg1 = (double) sum1 / term1.length; // 1학기 평균 계산
		avg2 = (double) sum2 / term2.length; // 2학기 평균 계산
		if (avg1 > avg2) { // 평균이 더 높은 학기
			goodTerm = 1;
		} else if (avg1 < avg2) {
			goodTerm = 2;
		}

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("뉴진스")) { // 뉴진스 index 찾기
				newJeans = i;
			}
		}

		// 1. 2학기 성적이 오른 학생은 몇명?
		System.out.println("2학기 성적이 오른 학생: " + count + "명");
		// 2. 1학기,2학기 성적이 동일한 학생 몇명?
		System.out.println("1학기,2학기 성적이 동일한 학생: " + count2 + "명");
		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		System.out.println("2학기 성적이 만점인 학생: 이름)" + names[perfect] + ", 번호)" + perfect);
		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		System.out.println("1학기 성적 평균: " + avg1 + ", 2학기 성적 평균:" + avg2);
		System.out.println("성적 평균이 더 높은 학기는: " + goodTerm + "학기");
		// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		System.out.println("뉴진스의 1학기 성적: " + term1[newJeans] + ",뉴진스의 2학기 성적: " + term2[newJeans]);

	}

}