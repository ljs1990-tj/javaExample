package day9;

public abstract class Calculator { // 추상클래스
	int sum(int x, int y) {
		return x+y;
	}
	int sub(int x, int y) {
		return x-y;
	}
	abstract int mul(int x, int y);
	abstract int div(int x, int y);
}
