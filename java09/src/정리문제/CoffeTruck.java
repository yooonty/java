package 정리문제;

public class CoffeTruck extends Truck{
	String beanType;
	
	public void coffee() {
		System.out.println("커피를 주다.");
	}

	@Override
	public String toString() {
		return "CoffeTruck [beanType=" + beanType + ", weight=" + weight + ", Color=" + Color + "]";
	}
	
}
