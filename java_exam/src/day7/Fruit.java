package day7;

public class Fruit {
	private String name ;
	private int price ;
	private int num ;
	
	Fruit(String name, int price, int num){
		this.name = name;
		this.price = price;
		this.num = num;
	}
	Fruit(String name, int price){
		this(name, price, 0);
//		this.name = name;
//		this.price = price;
//		this.num = 0;
	}
	
	void toString2(){
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
