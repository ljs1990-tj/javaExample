package day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 스캐너를 통해 숫자 5개를 입력받고
//		입력받은 수 중에서 가장 큰 수, 가장 작은 수, 
//		입력한 수들의 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			sum += input;
			if(i == 1) {
				max = input;
				min = input;
			} else {
				// 큰 수 갱신
//				if(input > max) {
//					max = input;
//				}
				max = Math.max(max, input);
				
				// 작은 수 갱신
//				if(input < min) {
//					min = input;
//				}
				min = Math.min(min, input);
			}
			
			
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		System.out.println("평균 : " + ((double) sum / 5));
		
	}
}
