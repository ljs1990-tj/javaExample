package day8;

public class FruitMain {
	
	static void fruitBoxing(Fruit f, int num) {
		System.out.println(f.name + "를 담았습니다.");
	}
	
//	static void orangeBoxing(Orange o, int num) {
//		System.out.println(o.name + "를 " + num + "개 박스에 담았습니다.");
//	}
//	static void bananaBoxing(Banana b, int num) {
//		System.out.println(b.name + "를 " + num + "개 박스에 담았습니다.");
//	}
//	static void appleBoxing(Apple a, int num) {
//		System.out.println(a.name + "를 " + num + "개 박스에 담았습니다.");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
//		fruitBoxing(orange, 5);
		orange.print();
		
		Apple apple = new Apple();
		apple.name = "사과";
//		fruitBoxing(apple, 10);
		apple.print();
		
		Banana banana = new Banana();
		banana.name = "바나나";
//		fruitBoxing(banana, 8);
		banana.print();
		
	}
	
	static void test(int a) {
		System.out.println(a);
	}
}
