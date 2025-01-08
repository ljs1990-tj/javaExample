package day9;

public class GoodCalc extends Calculator{

	@Override
	int mul(int x, int y) {
		return x*y;
	}
	
	@Override
	int div(int x, int y) {
		return x/y;
	}
	
	int mod(int x, int y) {
		return x%y;
	}
}
