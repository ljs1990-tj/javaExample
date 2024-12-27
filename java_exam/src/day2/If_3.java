package day2;

public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다중 else ~ if
		// score가 90이상 => A
		// 80~89 => B
		// 70~79 => C
		// 70미만 => F
		int score = 95;
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
	}
}
