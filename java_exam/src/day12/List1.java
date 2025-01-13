package day12;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =
				new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		list.add(1, 100);
		System.out.println(list);
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
	}
}




