package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<>();
		
		while(true) {
			System.out.print("[(1) 추가 (2) 확인 (3) 삭제 (4) 종료] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 입력
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("나이 : ");
				map.put("age", scan.nextInt());
				System.out.print("주소 : ");
				map.put("addr", scan.next());
				list.add(map);
			} else if(menu == 2) {
				// 출력
				for(int i=0; i<list.size(); i++) {
					System.out.print((i+1) + ". ");
					System.out.print("이름 : " + list.get(i).get("name") + ", ");
					System.out.print("나이 : " + list.get(i).get("age") + ", ");
					System.out.println("주소 : " + list.get(i).get("addr"));
				}
			} else if(menu == 3) {
				// 삭제
				System.out.print("삭제할 사용자 이름 입력 : ");
				String name = scan.next();
				boolean deleteFlg = false;
				for(int i=0; i<list.size(); i++) {
//					list.get(i).get("name");
					HashMap<String, Object> map = list.get(i);
					if(name.equals(map.get("name"))) {
						list.remove(i);
						deleteFlg = true;
						break;
					} 
				}
				if(deleteFlg) {
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("이름을 다시 확인해주세요.");
				}
				
			} else if(menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4번 중에 선택해라");
			}
		}
		
	}
}
