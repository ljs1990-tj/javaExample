package day17;

public abstract class Animal {
	private String name ;
	private int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	abstract void sound();
	
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
}
