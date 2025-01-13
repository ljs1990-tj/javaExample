package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String name = scan.next();
			list.add(name);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		// 가장 긴 이름이 동일 값이 있을 경우
		// 동일한 길이의 이름 모두 출력
		String longName = "";
		for(int i=0; i<list.size(); i++) {
			if(longName.length() < list.get(i).length()) {
				longName = list.get(i);
			}
		}
		System.out.println("\n가장 긴 이름 : " + longName);
	}

}
