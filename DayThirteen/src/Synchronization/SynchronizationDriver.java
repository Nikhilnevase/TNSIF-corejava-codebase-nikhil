package Synchronization;

public class SynchronizationDriver {
	
	public static void main(String[] args) throws InsufficiantBalanceException {
		
		Account a1 = new Account(1001,"nikhil",50000);
		
		System.out.println(a1);
		
		
		accountThread t[]=new accountThread[10];
		
		for(int i=1;i<10;i++) {
		
			t[i] = new accountThread(a1, 1000 * (i+1));
			
		    
		}
		try {
			for(int i=1;i<10;i++)
			{
				t[i].join();
				
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("----------------------");
		System.out.println(a1);
		
	}
	
	
}
