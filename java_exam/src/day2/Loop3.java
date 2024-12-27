package day2;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // i의 값들을 누적해서 더할 변수
		for(int i=1; i<=10; i++) { 
			sum = sum + i; // sum에 i의 값을 계속 누적해서 덧셈
			// sum += i;
		}
		
		System.out.println("합 : " + sum);
		// 합 : 55
	}

}
