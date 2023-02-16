package 상속;

public class 슈퍼맨 extends 맨{
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날다.");
		System.out.println("이름: "+name);
		
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다~~~~~");
	}

	@Override
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
