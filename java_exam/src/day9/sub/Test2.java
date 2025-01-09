package day9.sub;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test2 {
	static void addNum(int n) {
		n++;
	}
	
	static void addArr(int[] qqq) { // 0x123  
		qqq[0] = 100;
	}
	
	static void strArr(String[] arr) {
		arr[2] = "과자2";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		addNum(n);
		System.out.println(n); 
		
//		int arr[] = {1,3,5}; // 0x123  
////		arr[0] => 0x123[0]
//		addArr(arr);
//		System.out.println(arr[0]);
		String heung[] = {"라면10", "쌀1kg", "과자3"};
//		heung 만수동 주공6단지 ~~
		String geon[] = heung;
//		geon 만수동 주공6단지 ~~
		geon[0] = "라면9";
		System.out.println(heung[0]);
		strArr(geon);
		System.out.println(heung[2]);
		
	}

}
