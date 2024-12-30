package day3;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		// 문자열 equals() 메소드를 쓰세요
		// 숫자는 그냥 == 이거 쓰면 됨
		if(input.equals("종료")) {
			System.out.println("종료되었습니다.");
		} else {
			System.out.println("실행 중입니다.");
		}
		
		
		
	}
}
