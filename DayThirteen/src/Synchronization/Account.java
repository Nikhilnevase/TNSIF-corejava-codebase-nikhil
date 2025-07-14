package Synchronization;

public class Account  implements Bank{
	
	private   int accID ;
	private String name;
	private   int Balance;
	
	

	public  int getAccID() {
		return accID;
	}

	public  void setAccID(int accID) {
		this.accID = accID;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		this.Balance = balance;
	}
	
	
	
	

	public Account() {
		super();
	}
	
	

	public Account(int accID,String name, int Balance) {
		super();
		this.accID=accID;
		this.name=name;
		this.Balance=Balance;
	}
	
	
	//to string
		@Override
		public String toString() {
			return "Account [accNo=" + accID + ", name=" + name + ", balance=" + Balance + "]";
		}

		@Override
		public void withdraw(int amt) throws InsufficiantBalanceException {
			
			if (Balance - amt < MniAmt)
				throw new InsufficiantBalanceException();
			else
			{
				Balance=Balance-amt;
				System.out.println("After withdrawing Rs:"+
				amt +" Current balance is Rs:"+Balance);
			}
			}
			// TODO Auto-generated method stub
			
		

		@Override
		public void deposite(int amt) throws depositelimitException {
			
			if(amt>25000)
				throw new depositelimitException("Daily Limit exceed .....");
			else
			{
				Balance+=amt;
				System.out.println("Amount Deposited....."+amt);
			}
			// TODO Auto-generated method stub
			
		}

	

		

		
	



	


	

}
