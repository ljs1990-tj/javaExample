package day10;

public class Sample {
	String name ;
	int age ;
	static int money = 100000;
	
	Sample(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Sample obj() {
		return this;
	}
}
