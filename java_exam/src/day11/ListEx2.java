package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list
			= new ArrayList<>();
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				System.out.print("주소 : ");
				String addr = scan.next();
				Human h = new Human(name, age, addr);
				list.add(h);
				System.out.println("--------------------------------------");
			} else if(menu == 2) {
				System.out.println("--------------------------------------");
				if(list.size() == 0) {
					System.out.println("등록된 사용자가 없습니다.");
				}
				for(int i=0; i<list.size(); i++) {
					System.out.print((i+1) + ". ");
					System.out.print("이름 : " + list.get(i).getName() + ", ");
					System.out.print("나이 : " + list.get(i).getAge() + ", ");
					System.out.println("주소 : " + list.get(i).getAddr() + " ");
				}
				System.out.println("--------------------------------------");
			} else if(menu == 3) {
				System.out.println("--------------------------------------");
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String name = scan.next();
				boolean deleteFlg = false;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						deleteFlg = true;
						break;
					}
				}
				if(deleteFlg) {
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				System.out.println("--------------------------------------");
			} else if(menu == 4){
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~4중에 선택해 주세요.");
			}
			
		}
		
		
		
	}
}
