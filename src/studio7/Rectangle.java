package studio7;

public class Rectangle {

	private int length;
	private int width;
	private int area;
	private int perim;
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}
	public int getPerimeter() {
		perim = 2 * length + 2 * width;
		return perim;
	}
	
	public int getArea() {
		area = length * width;
		return area;
	}
	
	public boolean ifSquare() {
		if(length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBigger(Rectangle compare) {
		if(compare.getArea() > this.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 10);
		int p1 = r1.getPerimeter();
		int a1 = r1.getArea();
		boolean s1 = r1.ifSquare();
		System.out.println("Perimeter:" + p1);
		System.out.println("Area: " + a1);
		System.out.println("Is a square: " + s1);
		Rectangle r2 = new Rectangle(2,2);
		boolean bigger = r1.isBigger(r2);
		System.out.println("Is bigger: " + bigger);
		
	}
}
