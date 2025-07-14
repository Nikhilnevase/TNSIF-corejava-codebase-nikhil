package Synchronization;

public class accountThread extends  Thread{
	
	
	public  Account acc;
	public   int amt;
	
	
	public accountThread(Account acc , int amt) {
          super();
          this.acc=acc;
          this.amt=amt;
         
          start();
	}


	@Override
	public void run()
	{
		try
		{
			acc.withdraw(amt);
		}
		catch(InsufficiantBalanceException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
		

}
