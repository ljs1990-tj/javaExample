package day17;

public class Review_if_for {
	public static boolean test(int num1, int num2) {
		System.out.println("num3은 num2보다는 크다");
		return num1>num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		if(num1 > num2 && test(num3, num2)) {
//			
//		}
//		int num4 = num1>num2?num1:num2;
//		if(num1 > num2) {
//			num4 = num1;
//		} else {
//			num4 = num2;
//		}
		for(int i=2; i<10; i++) {
			System.out.println("=== " + i + "단 === ");
			for(int j=1; j<10; j++) {
				System.out.println();
			}
		}
	}
}
