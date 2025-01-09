package day9.sub;

import java.util.Arrays;

public class ArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr2[] = arr;
//		arr2[3] = 100;
//		System.out.println(arr[3]);
		int arr[] = {1,3,5,4,2};
//		int max = ArrayClass.maxValue(arr);
//		System.out.println(max);
//			
//		ArrayClass.changeArr(arr); 
//		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(ArrayClass.minValue(arr));
		
		ArrayClass.maxMinChange(arr);
		System.out.println(Arrays.toString(arr));
	}
}
