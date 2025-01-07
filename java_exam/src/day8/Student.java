package day8;

public class Student extends Person{
	String stuNo ; // 학번
	int grade ; // 학년
	
	Student(){
		System.out.println("자식 클래스 생성자 실행!");
	}
	
	Student(String name, int age, String addr){
		super(name, age, addr);
	}
	
	Student(String name, int age, String addr, String stuNo){
		super(name, age, addr);
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
}
