package day2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		switch (score/10) { // 정수/정수 이므로 결과도 정수로 나옴
		case 10:
		case 9: {
			System.out.println("A");
			break;
		}
		case 8: {
			System.out.println("B");
			break;
		}
		case 7: {
			System.out.println("C");
			break;
		}
		default:
			System.out.println("F");
		}
	}

}
