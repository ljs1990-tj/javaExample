package day10;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample("홍길동", 30);
		// s1 => 0x123(주소)
		s1.age = 31; // 0x123(주소)에 있는 age값을 변경
		Sample s1_sub = s1.obj();
		// s1_sub => 0x123(주소) 
		s1_sub.age = 40;
		System.out.println(s1.age);
		s1.money = 50000;
		
		Sample s2 = new Sample("김철수", 35);
		// s2 => 0x987
		s2.age = 36; // 0x987(주소)에 있는 age값을 변경
		System.out.println(Sample.money);
	}

}
