package 상속기본;

public class 볼펜 extends 학용품{
	int 두께;
	
	public void 글을쓰다() {
		System.out.println("볼펜으로 글쓰다.");
	}

	@Override
	public String toString() {
		return "볼펜 [두께=" + 두께 + ", price=" + price + ", company=" + company + "]";
	}
	
	
}
