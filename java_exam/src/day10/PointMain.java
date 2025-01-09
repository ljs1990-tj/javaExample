package day10;

import java.util.Scanner;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);

		if (a == b) // false
			System.out.println("a==b");
		
		if (a.equals(b)) // true
			System.out.println("a is equal to b");
		
		if (a.equals(c)) // false
			System.out.println("a is equal to c");

		
		Scanner s = new Scanner(System.in);
		String name = "hong";
		System.out.println(name.length());
//		System.out.print("이름 : ");
//		String name2 = s.next();
//		System.out.println(name.equals(name2));
		
		int q = 10;
		String w = q + ""; // "10"
	}
}
