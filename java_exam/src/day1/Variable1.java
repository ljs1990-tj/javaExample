package day1;

public class Variable1 {
	public static void main(String[] args) {
		// Ctrl + Shift + F
		String name = "홍길동";
		int stuNum = 20241226;
		
		int age; // integer(정수)
		age = 30;
		
		double height = 170.5;
		boolean isSingle = true; // false
		// syso + Ctrl + Space
		System.out.println(name); 
		System.out.println(age);
		
		age = 31;
		System.out.println(age);
		
		final double PI = 3.141592;
//		PI = 3.14; // 상수(final)라서 수정 불가능
		
		// 홍길동의 나이는 31 입니다.
		System.out.println(
			name + "의 나이는 " + age + " 입니다."
		);
		
		
	}
}
