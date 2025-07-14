package Synchronization;

public class InsufficiantBalanceException extends Exception {

	public InsufficiantBalanceException(String string) {
		super(string);
		
		System.err.println(string);
		// TODO Auto-generated constructor stub
	}

	public InsufficiantBalanceException() {
		super();
	}
	
	

}
