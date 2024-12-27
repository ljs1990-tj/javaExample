package day2;

public class If_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		// 단순 if
//		if(num >= 20) { // num이 20보다 크거나 같다면
//			System.out.println("20보다 크거나 같다.");
//		}
		
		// if ~ else
		if(num >= 20) { // num이 20보다 크거나 같다면
			System.out.println("20보다 크거나 같다.");
		} else { // num이 앞선 조건에 만족하지 않는 경우
			System.out.println("20보다 작다.");
		}
		
	}
}
