package day9;

public class Point3D extends Point{
	private int z ;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// (x,y,z) 의 점입니다.
		return "(" + getX() + "," + getY() + "," + z + ") 의 점";
	}
	
	void moveUp() {
		z++;
	}
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
}
