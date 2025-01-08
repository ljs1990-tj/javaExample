package day9.sub;

public class Test {

	static void increase(int n) {
		n++;
	}
	
	static void increase(Circle c) {
		// 0x123.radius++;
		c.radius++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		increase(n);
		System.out.println(n);
		
		Circle c = new Circle(50);
		increase(c);
		System.out.println(c.radius);
		
		Circle c2 = new Circle(20);
		c.radius = 30;
		
		System.out.println(c2.radius); // 20
		Circle c3 = c2;
		
		c3.radius = 100;
		System.out.println(c2.radius); // 100
		
	}
}

class Circle{
	int radius ;
	
	Circle(int r){
		radius = r;
	}
}


