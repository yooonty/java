package 정리문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeTruck t1 = new CoffeTruck();
		t1.Color = "흰색";
		t1.weight = 1000;
		t1.beanType = "아라비카";

		t1.go();
		t1.load();
		t1.coffee();
		System.out.println(t1.toString());
	}

}
