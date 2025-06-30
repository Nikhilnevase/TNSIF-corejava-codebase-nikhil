package dayone;

public class javabasics {
	public static void main(String[] args) {
		int a = 12;
		short b = 36;
		byte c = 78;
		long d = 98830234777578388L;
		float e = 7.111f/2.444f;
		double f = 7.6273246d/2.8684518d;
		boolean flag = false;
		boolean flag2 = true;
		System.out.println(a);
		
		//widening  typecasting or implicit typecasting
		//here we  convert small data type to large data type
		byte a1=2;
		int b1 =a1; // valid 
		System.out.println(b1);
		 // narrowning type casting or explicite type casting 
		short a2= 130;
		byte b2 = (byte) a2;
		System.out.println(b2);
		
	}

}
