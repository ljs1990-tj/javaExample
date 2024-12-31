package day4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 스캐너를 통해 숫자 5개를 입력받고
//		입력 받은 수 중에서 가장 작은 수를 구하시오.
		Scanner scan = new Scanner(System.in);
		int min = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(i == 1) {
				min = input;
				continue;
			} 
			min = min > input ? input : min;
		}
		System.out.println("최소 값 : " + min);
	}

}
