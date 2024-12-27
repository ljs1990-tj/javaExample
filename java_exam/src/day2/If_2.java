package day2;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 값을 입력받아서
		// 입력받은 숫자가 홀수인지 짝수인지 판별
		// 홀수면 "홀수 입니다."
		// 짝수면 "짝수 입니다."
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num = scan.nextInt();
		if(num % 2 == 0) { // 입력받은 값을 2로 나누었을 때 0이 나오는 경우
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
	}

}
