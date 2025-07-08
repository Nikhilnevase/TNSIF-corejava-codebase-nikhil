package NestedDemo;

public class NestedDemo implements OuterInterface ,OuterInterface.Innerinterface {

	@Override
	public void show() {
		System.out.println("This is outter");
		
	}

	@Override
	public void calArea() {
		
		System.out.println("This is Inner ");
	}
	
	

}
