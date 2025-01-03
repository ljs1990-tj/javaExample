package day6;

public class Food {
	private String name ;
	private int price ;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void sell() {
		System.out.println(price + "원에 판매했습니다.");
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
	
//	void setPrice(int price) {
//		if(price < 0) {
//			System.out.println("가격은 다시 확인해주세요.");
//			return;
//		} 
//		System.out.println("정말 " + price + "가 맞습니까?");
//		this.price = price;
//	}
//	int getPrice() {
//		return price;
//	}
}
