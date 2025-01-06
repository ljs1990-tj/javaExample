package packB;

import packA.ClassA;

public class ClassB extends ClassA{
	void test() {
		varPublic = 10;
//		varDefault = 10; // 다른 패키지이므로 접근 불가
		varProtected = 10; 
		// 다른 패키지 이지만 상속관계라서 접근 가능
//		varPrivate = 10; 
		// private 이라 접근 불가(같은 클래스에서만 접근 가능)
	}
}
