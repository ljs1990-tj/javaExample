package day4;

import java.util.Arrays;

public class Array7 {
	public static void main(String[] args) {
		int arr[] = {3, 2, 5, 4, 1};
		int maxIndex = 0;
		int minIndex = 0;
		// arr[maxIndex] = 3
		for(int i=1; i<arr.length; i++) {
			// 가장 큰 값의 위치
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			// 가장 작은 값의 위치
			minIndex = arr[i] < arr[minIndex] ? i : minIndex; 
		}
		System.out.println(arr[maxIndex]);
		System.out.println(arr[minIndex]);
		// {3, 2, 5, 4, 1}
		// {3, 2, 1, 4, 5}
		
		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
