package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		
		for(;;) {
			HashMap<String, Object> map 
				= new HashMap<String, Object>();
			System.out.print("[(1) 추가 (2) 확인 (3) 종료] ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("포인트 : ");
				map.put("point", scan.nextInt());
				list.add(map);
			} else if(menu == 2) {
				System.out.println(list);
//				System.out.print("이름 : ");
				// "ooo님의 포인트는 ooo 입니다."
				
			}
		}
		
		
		
	}
}
