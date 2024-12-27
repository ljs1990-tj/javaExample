package day2;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		String result = num >= 0 ? "양수" : "음수"; // 삼항연산자 : num>=0이 true이면 "양수"가 result, false면 "음수"가 result에 들어 감
		System.out.println(result);
		
//		if(num > 0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("음수");
//		}  
	}

}
