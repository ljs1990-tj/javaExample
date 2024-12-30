package day3;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ctrl + Shift + o
		Scanner scan = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		age += 1; // age = age + 1;
		if(age >= 20) { // age가 20보다 크거나 같다면
			System.out.println("성인 입니다.");
		} else if(age >= 10){
			System.out.println("10대 입니다.");
		} else {
			System.out.println("10살 미만 입니다.");
		}
		
		// =
		int num1 = 10;
		int num2 = 20;
		System.out.println(age == num1); // true or false
		// and ==> 둘다 true일때만 true(하나라도 false 무조건 false)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		// or ==> 하나라도 true 결과는 true
		System.out.println(true || false); // true 
		System.err.println(false || false); // false
		
		if(num1 > 5 && num2 > 30) { // true && false
			System.out.println("실행"); // 실행 x
		}
		if(num1 > 5 || num2 > 30) { // true || false
			System.out.println("실행"); // 실행 o
		}
		
	}

}
