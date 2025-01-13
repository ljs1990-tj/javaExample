package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);
	
	public static int setScore(String msg, int max) {
		while(true) {
			System.out.print(msg + "점수 : ");
			int score = scan.nextInt();
			if(score <= max && score >= 0) {
				return score;
			} 
			System.out.println("0~" + max + " 사이 값 입력해주세요.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		
		while(true) {
			HashMap<String, Object> map 
				= new HashMap<String, Object>();
			// 이름(name), 자바점수(java), 
			// 오라클점수(oracle), html점수(html)
			// 점수는 0~100 사이만 가능 
			// 0~100 외에 값을 입력하면 다시 입력
			// map을 list에 추가
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (4) 종료] ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("name", name);

				// 자바(0~40), 오라클(0~35), HTML(0~25)
				map.put("java", setScore("자바",40));
				map.put("oracle", setScore("오라클",35));
				map.put("html", setScore("HTML",25));
				list.add(map);
				
			} else if(menu == 2){
				// 이름, 과목명, 점수를 입력받아서
				// 해당 학생의 과목 점수를 수정
				// ex)
				// 이름 : 홍길동
				// 과목 : 자바
				// 자바점수 : 30
				// 홍길동의 자바점수를 30으로 변경
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.print("과목 : ");
						String subject = scan.next();
						
					}
				}
			} else if(menu == 3) {
				System.out.println(list);
			} else if(menu == 4) {
				break;
			}
		}
		
		
	}

}
