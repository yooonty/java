package 정리문제;

public class 딸 {
	String name;
	String gender;
	static int 아빠지갑 = 10000;
	static int count;

	public 딸(String name, String gender) {
		count++;
		아빠지갑 -= 1000;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

	public void tv보다() {
		System.out.println("티비를 봅니다!");
	}

}
