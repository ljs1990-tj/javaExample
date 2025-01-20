package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름, 나이, 주소를 입력받아서
		// map에 저장하고 list에 추가하기
		// 3명!
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map =
					new HashMap<String, Object>();
			System.out.print("이름 : ");
			String name = scan.next();
			map.put("name", name);
			System.out.print("나이 : ");
			int age = scan.nextInt();
			map.put("age", age);
			System.out.print("주소 : ");
			String addr = scan.next();
			map.put("addr", addr);
			list.add(map);
			System.out.println("----------------------");
		}
		System.out.println(list);
		
		// 수정할 사용자 입력 : 홍길동
		// 리스트안에 맵에 홍길동이 있으면 -> 주소 수정할수 입력받아서 수정
		// 없으면 -> 없는 사용자 입니다.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
