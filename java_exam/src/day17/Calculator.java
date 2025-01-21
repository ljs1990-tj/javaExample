package day17;

public interface Calculator {
	// 숫자 2개 받아서 더한 후 리턴
	int sum(int x, int y);
	// 숫자 3개 받아서 더한 후 리턴
	int sum(int x, int y, int z);
	// 숫자 2개 받아서 곱한 후 리턴
	int multiple(int x, int y);
	// 숫자 2개 받아서 나눈 후 리턴
	int divide(int x, int y);
}
