package day17;

import java.util.Arrays;

public class Review_Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 4, 2, 6, 3 };
//		for(int i=0; i<arr.length-1; i++) {
//			int min = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			int temp = arr[min];
//			arr[min] = arr[i];
//			arr[i] = temp;
//		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
