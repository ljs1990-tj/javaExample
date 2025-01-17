package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test6 {
	
	static Scanner s = new Scanner(System.in);
	public static int setNumber(String msg, int min, int max) {
		while(true) {
			System.out.print(msg + ": ");
			int number = s.nextInt();
			if(number >= min && number <= max) {
				return number;
			}
			System.out.println(min + "~" + max + " 값을 입력해주세요.");
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("=== 학생 관리 시스템 입니다! ===");
		
		while(true) {
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료] ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 입력 : ");
				String name = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student = list.get(i);
					if(student.get("name").equals(name)) {
						flg = true;
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
					} 
				}
				if(!flg) {
					map.put("name", name);
					list.add(map);
					System.out.println("학생이 추가되었습니다!");
				}
			} else if(menu == 2) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student = list.get(i);
					if(student.get("name").equals(name)) {
						flg = true;
						int java = setNumber("java", 0, 100);
						int oracle = setNumber("oracle", 0, 100);
						student.put("java", java);
						student.put("oracle", oracle);
					} 
				}
				if(!flg) {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}
			} else if(menu == 3) {
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
			} else if(menu == 4) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student = list.get(i);
					if(student.get("name").equals(name)) {
						flg = true;
						System.out.print("수정할 과목명(java, oracle) : ");
						String subject = s.next();
						if(student.containsKey(subject)) {
							int score = setNumber(subject, 0, 100);
							student.put(subject, score);
						} else {
							System.out.println("없는 과목입니다. 메뉴로 이동 합니다.");
						}
					} 
				}
				if(!flg) {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}
			} else if(menu == 5){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("없는 메뉴 입니다.");
			}
		}
		
	}
}
