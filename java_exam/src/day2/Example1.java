package day2;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나머지 연산
		// 숫자를 2로 나누었을 때 나머지가 1이 나오면 홀수 0이 나오면 짝수
		// 10 % 2 => 0 ==> 짝수
		// 11 % 2 => 1 ==> 홀수
		// 12132131241 % 2 => 1 ==> 홀수 
		int num = 10;
		if(num % 2 == 0) {
			System.out.println("num은 5보다 크다");
		} else {
			System.out.println("num은 5보다 작거나 같다");
		}
	}
}
