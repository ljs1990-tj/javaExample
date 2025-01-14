package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);
	public static int setNumber(String msg, int min, int max) {
		while(true) {
			System.out.print(msg + ": ");
			int number = scan.nextInt();
			if(number >= min && number <= max) {
				return number;
			}
			System.out.println(min + "~" + max + " 값을 입력해주세요.");
		}
		
		// 100~100000
//		while(true) {
//			System.out.print("가격 : ");
//			int price = scan.nextInt();
//			if(price >= 100 && price <= 100000) {
//				map.put("price", price);
//				break;
//			}
//			System.out.println("100~100000 값을 입력해주세요.");
//		}
//		// 1~300
//		while(true) {
//			System.out.print("개수 : ");
//			int num = scan.nextInt();
//			if(num >= 1 && num <= 300) {
//				map.put("num", num);
//				break;
//			}
//			System.out.println("1~300 값을 입력해주세요.");
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		// 과일 가게
		// 1번 메뉴 - 과일추가
		// 2번 메뉴 - 과일판매
		// 3번 메뉴 - 과일확인
		// 4번 메뉴 - 종료
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 추가 (2) 판매 (3) 확인 (4) 종료] ");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 추가
				// map에 과일명(name), 가격(price), 개수(num) 을 입력받아서
				// list에 저장
				System.out.print("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						int num = setNumber("개수", 1, 300 - (int) user.get("num"));
						user.put("num", (int) user.get("num") + num);
						updateFlg = true;
						break;
					}
				}
				
				if(!updateFlg) {
					int price = setNumber("가격", 100, 100000);
					map.put("price", price);
					int num = setNumber("개수", 1, 300);
					map.put("num", num);
					list.add(map);
				}
			} else if(menu == 2) {
				// 판매
				// 과일명 : 사과
				// 구매개수 : 10
				// '10개를 판매하여 30개 남았습니다.'
				System.out.print("과일명 :");
				String name = scan.next();
				System.out.print("구매개수 : ");
				int num = scan.nextInt();
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						if(num > (int) fruit.get("num")) {
							System.out.print("재고가 부족합니다. ");
							System.out.println("현재 남은 개수는 " + (int) fruit.get("num") + "개 입니다.");
						} else {
							fruit.put("num", (int) fruit.get("num") - num);
						}
						updateFlg = true;
						break;
					}
				}
				if(!updateFlg) {
					System.out.println("없는 과일 입니다.");
				}
				// 없는 과일 입력할 경우?
				// => 없는 과일 입니다.
				
				// 보유 개수보다 많은 개수를 선택할 경우
				// '현재 사과는 5개 남아있습니다.'
				
			} else if(menu == 3) {
				// 확인
				// 과일명 : 사과
				// "사과의 가격은 1000, 개수는 5개 남았습니다."
				System.out.print("과일명 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.println(
								name 
								+ "의 가격은 " 
								+ fruit.get("price") 
								+ ", 개수는 " 
								+ fruit.get("num") 
								+ "개 남았습니다."
						);
					}
				}
			} else if(menu == 4) {
				// 종료
			} else {
				// 다시시도
			}
		}
		
		
	}

}
