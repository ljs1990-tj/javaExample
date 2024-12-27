package day2;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for(;;) { // 무한루프
			System.out.print("(1)추가 (2)판매 (3)종료 => ");
			int choice = scan.nextInt();
			if(choice == 1) { // 입력한 값이 1일 경우 
				System.out.println("추가되었습니다.");
			} else if(choice == 2) { // 입력한 값이 2일 경우
				System.out.println("판매되었습니다.");
			} else if(choice == 3) { // 입력한 값이 3일 경우
				System.out.println("종료되었습니다.");
				break; // 반복문 빠져나가기
			} else { // 그외 숫자
				System.out.println("없는 메뉴 입니다.");
			}
			
		}
	}

}
