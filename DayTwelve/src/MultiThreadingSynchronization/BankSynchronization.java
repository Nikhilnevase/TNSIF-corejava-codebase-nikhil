package MultiThreadingSynchronization;

public interface  BankSynchronization {
	static final int MinBal=5000;
	static final int DailyLimits= 25000;
	public void deposite() throws highlimitException ;
	public void withdrawal() throws insufficiantBalException;
	

}
