package Staticmethod;

public class Myclass {
	
	private int section;
	
	private static int  srNo;
	
	static
	{
		System.out.print("with in static block ");
		srNo=1000;
		
	}

	public Myclass() {
		System.out.println("with in Default constuctor");
		srNo++;
		section++;
		
	}

	@Override
	public String toString() {
		return "Myclass [serial No =  "+srNo +"section = " + section + "]";
	}
	 
	static void display () {
		System.out.print("Sirial No = " + srNo);
	}
	
	

}
