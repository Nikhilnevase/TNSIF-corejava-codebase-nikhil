package Polymorphism;

public class Point {
	private float x;
	private float y;
	private float c;
	public Point() {
		
	}
	public Point(float x, float y) {
		System.out.println("This is 2-Parametarize Constructor ");
	
		this.x = x;
		this.y = y;
	}
	public Point(float x, float y, float c ) {
		this.c=c;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", c=" + c + "]";
	}
	
	
	
	


}
