package day5;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,1,4};
		int minIndex = 0; 
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		
		// {1,5,2,3,4};
		
		minIndex = 1; 
		for(int i=2; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[1];
		arr[1] = temp;
		
		// {1,2,5,3,4};
		minIndex = 2; 
		for(int i=3; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[2];
		arr[2] = temp;
		
		// {1,2,3,5,4};
		
		minIndex = 3; 
		for(int i=4; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[3];
		arr[3] = temp;
		// {1,2,3,4,5};
	}

}
