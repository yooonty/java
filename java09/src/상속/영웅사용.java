package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name="홍길동";
		p.age=100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		슈퍼맨 s = new 슈퍼맨();
		s.name="피지컬";
		s.age=100;
		s.power=5000;
		s.space();
		s.eat();
		s.run();
		
		원더우먼 w = new 원더우먼();
		w.solve();
		
	}

}
