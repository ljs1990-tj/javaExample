package day10;

public class Student {
	private int stuNo;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;
	
	Student(int stuNo, String stuName){
		this(stuNo, stuName, "");
	}
	
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stuName + " 학생의 학번은 " + stuNo + ", 나이는 " + age + " 입니다.";
	}
	
}
