package day1;

public class Calculator {
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = x/y; // int z = 10/3;
		// 정수(int)간의 나눗셈은 결과가 정수로 나온다.
		// 하나라도 실수(double)이면은 결과가 실수로 나온다.
		
		System.out.println(x + 10);
		System.out.println(y * 20);
		System.out.println(z);
		System.out.println(x+y);
		System.out.println(x); // 10
		System.out.println("x"); // x
		System.out.println("x + y = " + (x + y));
		
		int num1 = 10; 
		num1 = (int) 12.5;
		int num2 = 3;
		double num3 = 3.5;
		num3 = 10;
	}
}
