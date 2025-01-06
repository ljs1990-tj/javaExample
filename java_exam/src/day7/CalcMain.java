package day7;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.intro();
		
		int sum = calc.sum(5, 10);
		System.out.println(sum);
		sum = calc.sum(300, 1500);
		System.out.println(sum);
		sum = calc.sum(5.3, 3.1);
		System.out.println(sum);
		sum = calc.sum(10, 20, 30.5);
		System.out.println(sum); // 60
		
		
		
	}
}
