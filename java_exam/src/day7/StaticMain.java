package day7;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(StaticEx1.num); 
		// static이 아니면 객체를 만들어서 접근해야 하기 때문에
		
		System.out.println(StaticEx1.PI);
		int num = StaticEx1.staticSum(10, 20);
		System.out.println(num);
		
		StaticEx1 ex1 = new StaticEx1();
		ex1.money = 45000;
		
		StaticEx1 ex2 = new StaticEx1();
//		ex2.money = 0;
		System.out.println(ex2.money);
		
	}
}
