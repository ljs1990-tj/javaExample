package day4;

import java.util.Arrays;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 숫자 6개를 배열에 넣기
		Random ran = new Random();
		int arr[] = new int[6]; // {0,0,0,0,0,0}
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
