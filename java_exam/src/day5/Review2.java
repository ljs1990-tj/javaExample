package day5;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 10, 2, 4};
		int sum = 0;
		int max = arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			// 합
			sum = sum + arr[i]; // sum += arr[i];
			// 가장 큰 값 
			if(arr[i] > max) {
				max = arr[i];
			}
			// 가장 큰 값의 위치
			if(arr[i] > arr[index]) {
				index = i;
			}
		}
		
	}
}
