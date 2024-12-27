package day2;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		System.out.println(num1 > num2); // true
		System.out.println(num1 < num2); // false
		System.out.println(num1 >= num3); // true
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		
		boolean temp = true;
		System.out.println(temp); // true
		System.out.println(!temp); // false
		System.out.println(!(num1 > num2));
		
		System.out.println(true && true); // true
		System.out.println(false && true); // false
		System.out.println(true && false); // false
		System.out.println(false && false); // false
		
		System.out.println(true || true); // true
		System.out.println(false || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false

		
	}

}
