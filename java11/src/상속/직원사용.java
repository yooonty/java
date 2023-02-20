package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동"; // public
		// work.address = "강남구"; // default
		// ==>같은패키지에서만 가능!
		// work.salary = 100; // protected
		// ==>다른패키지인 경우 상속관계에서만 됨!
		// work.rrn="111"
	}

}
