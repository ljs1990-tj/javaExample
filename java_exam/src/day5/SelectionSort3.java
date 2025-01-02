package day5;

public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,1,4};
		// 배열에서 가장 작은 수를 찾아서 
		// 인덱스 0번째 값이랑 위치 변경
		int index = 0; // 가장 작은 값의 위치
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[index]) {
				index = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[index];
		arr[index] = temp;
		
		// arr = {1,5,2,3,4};
		index = 1;
		for(int i=2; i<arr.length; i++) {
			if(arr[i] < arr[index]) {
				index = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[index];
		arr[index] = temp;
		
		// arr = {1,2,5,3,4};
		
		index = 2;
		for(int i=3; i<arr.length; i++) {
			if(arr[i] < arr[index]) {
				index = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[index];
		arr[index] = temp;
		
		// arr = {1,2,3,5,4};
		index = 3;
		for(int i=4; i<arr.length; i++) {
			if(arr[i] < arr[index]) {
				index = i;
			}
		}
		temp = arr[3];
		arr[3] = arr[index];
		arr[index] = temp;
		
		// arr = {1,2,3,4,5};
		
	}
}
