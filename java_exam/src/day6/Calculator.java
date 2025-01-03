package day6;

public class Calculator {

	void sum(int x, int y) {
		System.out.println("두 수의 합은 " + (x+y));
	}
	
	int sum2(int x, int y) {
//		System.out.println("두 수의 합을 리턴합니다.");
		int a = x+y;
		return a;
	}
	
	int multiple(int x, int y) {
		return x*y;
	}
	double multiple(int x, double y) {
		return x*y;
	}
	
	int multiple(int x, int y, int z) {
		return x*y*z;
	}
	
}
