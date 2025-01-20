package day17;

import java.util.HashMap;

public class Student extends Person{
	
	private String stuNo ;
	private int grade ;
	
	Student(String name, int age, String stuNo, int grade) {
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString() + "\n학번은 " + stuNo + ", 학년은 " + grade + "학년";
		return str;
	}
	
	String study(String subject) {
		return subject + "는 재밌다!";
	}
	
	HashMap<String, Object> getInfo(){
		HashMap<String, Object> map = 
							new HashMap<>();
		map.put("stuNo", stuNo);
		map.put("grade", grade);
		return map;
		
	}
	
	
	
	
}
