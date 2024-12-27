package day2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 숫자하나 입력받아서
		// 1부터 입력받은 숫자까지의 합 구하기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int value = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=value; i++) { // 조건에 value(입력받은 값)을 넣어서 입력받은 값만큼 덧셈
			sum += i;
		}
		System.out.println(
			"1부터 " + value +  "까지의 합은 " + sum + " 입니다."
		);
	}

}
