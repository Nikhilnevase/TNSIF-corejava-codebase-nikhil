package ExceptionHandling;

public class TryCatchExample {
	
	static void performDivision(int a , int b) {
		try {
			System.out.println("I am in try block");
		int z=a/b;
		
		System.out.println(z);
		}
		catch(ArithmeticException e) {
			
			System.err.println("I am in catch block : " +e.getMessage());
			
		}
	}

}
