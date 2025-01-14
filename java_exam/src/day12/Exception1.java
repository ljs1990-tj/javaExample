package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("나뉘는 수 : ");
				int num1 = scan.nextInt();
				System.out.print("나눌 수 : ");
				int num2 = scan.nextInt();
				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("숫자 입력하셈");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예기치 못한 에러 발생");
			}
		}
	}
}
