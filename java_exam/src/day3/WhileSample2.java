package day3;

import java.util.Scanner;

public class WhileSample2 {
	public static void main(String[] args) {
		int count = 0; 
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수(양수)를 입력하고 마지막에 -1을 입력하세요.");

		int n = scanner.nextInt(); 
		while (n != -1) {
			if(n < -1) {
				System.out.println("양수를 입력해주세요.");
			} else if(n > max) {
				max = n;
			} 
			count++;
			n = scanner.nextInt(); 
		}
		if (count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("가장 큰 숫자는 " + max + " 입니다.");
		}
		scanner.close();
	}
}
