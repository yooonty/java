package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후에 온 손님 수

		// 계산기3을 이용해주세요.
		// 1. 전체 손님 수를 반환받아서 다음과 같이 프린트
		// 오늘 온 손님의 총 합은 9명입니다.
		int data1 = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + data1 + "명 입니다.");
		// 2. 오전과 오후 손님수 차이는? 다음과 같이 프린트
		// 손님 수 차이는 1명입니다.
		int data2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + Math.abs(data2) + "명 입니다.");
		// 3. 오전에 들어온 손님의 결제 금액은? 다음과 같이 프린트
		// 오전 결제금액은 35000원입니다.
		int data3 = cal3.mul(price, count1);
		System.out.println("오전 결제 금액은 " + data3 + "원 입니다.");
		// 4. 오후에 들어온 손님의 결제 금액은? 다음과 같이 프린트
		// 오후 결제금액은 28000원입니다.
		int data4 = cal3.mul(price, count2);
		System.out.println("오후 결제 금액은 " + data4 + "원 입니다.");
		// 5. 오전과 오후에 들어온 손님의 총 결제금액은? 다음과 같이 프린트
		// 오늘 하루 총 결제금액은 63000원입니다.
		int data5 = cal3.add(data3, data4);
		System.out.println("오늘 하루 총 결제금액은 " + data5 + "원 입니다.");
		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요. 다음과 같이 프린트
		// 1인당 결제금액은 7000원입니다.
		int data6 = cal3.div(data5, data1);
		System.out.println("1인당 결제금액은 " + data6 + "원 입니다.");

	}

}
