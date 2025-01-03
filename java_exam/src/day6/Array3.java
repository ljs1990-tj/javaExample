package day6;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,-4,-10,8,-15,6,2};
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				int orgNum = arr[j] > 0 ? arr[j] : -arr[j];
				int indexNum = arr[index] > 0 ? arr[index] : -arr[index];
				if(orgNum < indexNum) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		// {3,5,-4,-10,8,-15,6,2};
//		for(int i=0; i<arr.length-1; i++) {
//			int index = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j]*arr[j] < arr[index]*arr[index]) {
//					index = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = temp;
//		}
		
//		for(int i=0; i<arr.length-1; i++) {
//			int index = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(Math.abs(arr[j]) < Math.abs(arr[index])) {
//					index = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = temp;
//		}
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}
