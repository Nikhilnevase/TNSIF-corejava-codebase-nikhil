package Abstraction;

public class Square  extends Shape{
	
	float side;

	public Square() {
		super();
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calArea() {
		this.area=side*side;
	
		// TODO Auto-generated method stub
		
	}
	
	

}
