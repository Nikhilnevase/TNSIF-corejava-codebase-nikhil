package finalvariable;

public class Finalvariable {
	
	
	//final int a; //final instance vaiable should be initialize
	
	final int x= 100;
	
	final static int y;
	
	final static int z = 10;
	
	//instance method
	
	void change() {
	//	a=50;
	//	x=30;  final variable cannot be change
	//	z=50;   or assign
		
		
	}

	@Override
	public String toString() {
		return "Finalvariable [x=" + x + " y="+y+"]";
		
		
	}
	
	static {
		
		y=20;
	}

}
