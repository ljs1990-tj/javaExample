package packB;

import packA.ClassA;

public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.varPublic = 10;
//		a.varDefault = 10; // 다른 패키지이므로 접근 불가
//		a.varProtected = 10; // 다른 패키지이므로 접근 불가
//		a.varPrivate = 10; 
		// private 이라 접근 불가(같은 클래스에서만 접근 가능)
	}

}
