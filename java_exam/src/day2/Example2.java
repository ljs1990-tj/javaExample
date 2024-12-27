package day2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스캐너로 나이를 입력받아서
		// 입력받은 숫자가 20미만이면 "성인이 아닙니다."
		// 20~29 => "20대 입니다."
		// 30~39 => "30대 입니다."
		// 40~49 => "40대 입니다."
		// 50이상 => "50세 이상입니다."
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		if(age < 20) { // age가 20보다 작다면
			System.out.println("성인이 아닙니다.");
		} else if(age < 30){ // age가 30보다 작다면
			System.out.println("20대 입니다.");
		} else if(age < 40) { // age가 40보다 작다면
			System.out.println("30대 입니다.");
		} else if(age < 50) { // age가 50보다 작다면
			System.out.println("40대 입니다.");
		} else { // age가 50이상의 숫자일 경우
			System.out.println("50세 이상 입니다.");
		}
		
	}

}
