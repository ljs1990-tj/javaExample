package day8;

public class Person {
	String name ;
	private int age ;
	String addr;
	
	Person(){
		System.out.println("부모 클래스 생성자 실행!");
	}
	
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
}
