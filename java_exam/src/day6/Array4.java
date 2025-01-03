package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][2];
		// {0, 0},
		// {0, 0},
		// {0, 0},
		// {0, 0},
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(i + " , "+ j +"번째의 값 : ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		

	}
}
