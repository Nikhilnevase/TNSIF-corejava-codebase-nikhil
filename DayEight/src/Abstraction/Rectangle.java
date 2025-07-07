package Abstraction;

public class Rectangle extends Shape{
	
	float width;
	float height;
	public Rectangle() {
		super();
	}
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calArea() {
		this.area=width*height;
		
		// TODO Auto-generated method stub
		
	}
	
	
}