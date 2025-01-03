package day6;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
		System.out.println(hong.name);
		
		// 김철수, 25, 제주도
		Human kim = new Human("김철수", 25, "제주도");
		System.out.println(kim.name);
		
		// 박영희, 35
		Human park = new Human("박영희", 35);
		System.out.println(park.name); // 박영희
		System.out.println(park.addr); // "알수없음"
		
	}

}
