package day17;

import java.util.Arrays;

import day5.Human;
import packA.ClassA;

public class Review_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"햄버거", "김치찌개", "피자", "타코"};
		Human arr2[] = new Human[3];
		
		Human hong = new Human();
		hong.name = "홍길동";
		arr2[0] = hong;
		
		Human kim = new Human();
		kim.name = "김철수";
		arr2[1] = kim;
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}
}
