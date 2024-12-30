package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
//		int x = ran.nextInt(10); // 0~9 
//		int x = ran.nextInt(10)+1; // 1~10
		// 0=>1, 1=>2, 2=>3 .... 9=>10
		int x = ran.nextInt(8)+2; // 2~9
		int y = ran.nextInt(9)+1; // 1~9
		
		System.out.print(x + " * " + y + " = ");
		int answer = scan.nextInt();
		if(answer == x*y) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! 정답은 " + (x*y) + " 입니다.");
		}
		
	}

}
