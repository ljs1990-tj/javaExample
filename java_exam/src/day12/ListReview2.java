package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		// "그만"이 입력되기 전까지 문자열을 입력받아서
		// list 저장
		// 저장 이후 글자수가 5글자 이상인 문자열을 화면에 출력
		while(true) {
			System.out.print("단어 입력 : ");
			String input = scan.next();
			if(!input.equals("그만")) {
				list.add(input);
			} else {
				break;
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() >= 5) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

}
