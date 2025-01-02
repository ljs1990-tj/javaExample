package day5;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				// {5,4,3,2,1};
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
