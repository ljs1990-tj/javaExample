package day9.sub;

public class ArrayClass {
	// 배열에서 가장 큰 값을 찾는 메소드
	static int maxValue(int[] array) {
		int max = array[0];
		for(int value : array) {
			if(max < value) {
				max = value;
			}
		}
		return max;
	}
	
	// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드
	static int maxIndex(int[] array) {
		int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[index] < array[i]) {
				index = i;
			}
		}
		return index;
	}
	
	// 가장 큰 값의 위치를 찾아서 첫번째 값하고 변경
	static void changeArr(int[] array) {
		int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[index] < array[i]) {
				index = i;
			}
		}
		int temp = array[index];
		array[index] = array[0];
		array[0] = temp;

	}
	
	// 1. 정수형 배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
	static int minValue(int[] arr) {
//		int minIndex = 0;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] < arr[minIndex]) {
//				minIndex = i;
//			}
//		}
//		return arr[minIndex];
		
		int min = arr[0];
		for(int value : arr) {
			min = value < min ? value : min;
		}
		return min;
		
	}
	
	// 2. 정수형 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
	static void maxMinChange(int[] arr) {
		int max = 0;
		int min = 0;
		for(int i=1; i<arr.length; i++) {
			max = arr[i] > arr[max] ? i : max;
			min = arr[i] < arr[min] ? i : min;
		}
		int temp = arr[max];
		arr[max] = arr[min];
		arr[min] = temp;
	}
	
	
	
	
	
	
	
	
	
	
}
