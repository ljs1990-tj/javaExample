package day5;

public class Human {
	String name;
	int age;
	String addr;
	double height;
	boolean isSingle;
	
	void speak(String name) {
		// 말한다
		System.out.println(name + "가 말한다.");
	}
	void eat() {
		// 먹는다
		System.out.println("맛있는걸 먹는다.");
	}
	void intro(String name, int age, String addr) {
		// 이름, 나이, 주소
		// ooo의 나이는 oo, 주소는 ooo 입니다.
		System.out.println(
			name + "의 나이는 " + age + ", 주소는 " + addr + " 입니다."
		);
	}
	void intro2(String name) {
		System.out.println(
			name + "의 나이는 " + age + ", 주소는 " + addr + " 입니다."
		);
		System.out.println(name + "의 본명은 " + this.name);
	}
	
}
