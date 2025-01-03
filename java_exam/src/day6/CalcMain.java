package day6;

import java.util.Random;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.sum(3, 5);
		int a = calc.sum2(3, 5);
		System.out.println("합 : " + a);
		System.out.println("sum : " + a);
		
		// b = 5*2*3;
		int b = calc.multiple(5,2,3);
		System.out.println(b);
		int c = calc.multiple(10, 20);
		System.out.println(c);
		double d = calc.multiple(5, 7.5);
		
	}
}
