package Synchronization;

public  interface Bank {
	public static final int MniAmt=5000;
	public static final int MaxDept=25000;
	 void withdraw(int amt)throws InsufficiantBalanceException;
	 void deposite(int amt)throws depositelimitException;

}
