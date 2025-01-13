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
				String name = scan.next();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name")) ) {
						int newPoint = (int) list.get(i).get("point") + point;
						list.get(i).put("point", newPoint);
						break;
					}
				}
				
				
//				map.put("name", scan.next());
				
				
				list.add(map);
			} else if(menu == 2) {
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name")) ) {
						System.out.print(name + "님의 포인트는 ");
						System.out.println(list.get(i).get("point") + " 입니다.");
						break;
					}
				}
				// "ooo님의 포인트는 ooo 입니다."
				
			}
		}
		
		
		
	}
}
