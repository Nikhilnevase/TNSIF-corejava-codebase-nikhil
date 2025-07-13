package Interface;



	public interface Bank {
		

		final static float MINBAL=5000;   //variables declare in interface are always final static
		final static float Deposit_Limit=25000;
		
		public void deposit(float amount);
		public void withdraw(float amount);
		
		
		
	}

