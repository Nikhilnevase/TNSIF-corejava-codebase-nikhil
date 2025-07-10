package ExceptionHandling;



public class UncheckException {
	
	public static void main(String[] args) {
		
		int x[];
		try {
			
			x= new int [] {1,2,3,4,5};
			System.out.println(x[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.err.println("This Array Index not exist" + e.getMessage());
			
			
		}
	}

}
