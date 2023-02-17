package 복습;

public class MaskUse {

	public static void main(String[] args) {
		Mask mask1 = new Mask("하얀색", 1000, 3);
		// ==>개체생성시 멤버변수값을 자동으로 무조건 넣어주는 처리를 하고 싶다.
		Mask mask2 = new Mask("검은색", 2000, 5);

		System.out.println(mask1);
		System.out.println(mask2);

	}

}
