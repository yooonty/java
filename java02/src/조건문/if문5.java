package 조건문;

public class if문5 {

	public static void main(String[] args) {
		String ssn = "1055111";// 주민 번호 뒷자리!

		// String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함.
		if (ssn.equals("1055111")) {
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요!");
		}

		char gender = ssn.charAt(0);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다!");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다!");
			break;
		}
	}

}
