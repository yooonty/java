package 상속기본;

public class 노트 {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		pen.company = "모나미";
		pen.price = 3000;
		pen.두께 = 1;
		pen.사다();
		pen.글을쓰다();
		System.out.println(pen);
	}

}
