package day7;

public class Calculator {
	// intro 메소드를 생성
	// 리턴 x, 호출 시 "계산기 객체 입니다." 출력
	void intro() {
		System.out.println("계산기 객체 입니다.");
	}
	// int형 숫자 2개를 받아서 더한 후 되돌려 주는 메소드
	int sum(int x, int y) {
		return x+y;
	}
	// double형 숫자 2개를 받아서 더한 후
	// 소수점을 제거하고 int 형 데이터로 되돌려 주는 메소드
	int sum(double x, double y) {
		return (int) (x + y);
	}
	int sum(int x, int y, double z) {
		return x + y + (int)z;
	}
	
}
