package day9;

public class PositivePoint extends Point{
	
	PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	public String toString() {
		// (x,y) 의 점입니다.
		return "(" + getX() + "," + getY() + ") 의 점";
	}
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(!(x < 0 || y < 0)) { // x,y 둘다 양수일 때
			super.move(x, y);
		}
	}
}
