package day5;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(45)+1; // 1~45
			for(int j=0; j<i; j++) {
				if(ranNum == arr[j]) {
					System.out.println("중복된 숫자 있음");
				}
			}
			arr[i] = ranNum;
		}
		System.out.println(Arrays.toString(arr));
	}
}
