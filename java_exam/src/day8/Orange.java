package day8;

public class Orange extends Fruit{

	@Override
	void print() {
		System.out.println("오렌지는 달다.");
//		super.print();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "과일명 : " + name + ", 색 : " + color + ", 가격 : " + price;
	}
}
