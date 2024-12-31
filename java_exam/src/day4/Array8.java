package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("몇개의 숫자 저장? ");
		int size ;
		
		while(true) {
			size = scan.nextInt();
			if(size < 1) {
				System.out.print("1이상의 숫자를 입력해주세요. ");
			} else {
				break;
			}
		}
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(input > 0) {
				arr[i] = input;
			} else {
				System.out.println("양수를 입력해주세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
