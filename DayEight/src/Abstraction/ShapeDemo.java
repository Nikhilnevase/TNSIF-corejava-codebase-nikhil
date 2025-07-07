package Abstraction;

public class ShapeDemo {
    public static void main(String[] args) {
		 Shape s;
		 s=new Square();
		 s.calArea();
		 s.show();
		 
		 s= new Rectangle();
		 s.calArea();
		 s.show();
		 
		 s= new Square(203f);
		 s.calArea();
		 s.show();
		 
		 s=new Rectangle(28.3f,63.3f);
		 s.calArea();
		 s.show();
	}
}
