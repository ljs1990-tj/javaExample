package day4;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 12, 7, 10};
		int sum = 0;
		// 배열의 합 구하기
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max); 
	}
}
