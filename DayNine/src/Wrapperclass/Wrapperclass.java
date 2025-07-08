package Wrapperclass;

public class Wrapperclass {
	
	public static void main(String[] args) {
		
		Integer i =  new Integer(10);
		
		int a=i.intValue();
		
		System.out.println(a);
		
		int b= i;
		System.out.println(b);
		
		
		//without using int value()
		int c=i;
		System.out.println(c);
		
		//Autoboxing
		int a1=100;
		Integer i1=a1;
		Integer i2 = new Integer(a1);
		System.out.println(i1);
		System.out.println(i2);
	}

}
