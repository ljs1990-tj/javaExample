package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {1,3,5,4,2}
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(3);
//		list.add(5);
//		list.add(4);
//		list.add(2);
//		list.add(1, 10);
		// 숫자 입력받아서 list에 넣고
		// 총 합을 구해라
		// 단, -1을 입력하면 종료
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = scan.nextInt();
			if(input != -1) {
				list.add(input);
			} else {
				break;
			}
		}
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i); 
		}
		
		System.out.println(sum);
	}
}
