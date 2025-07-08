package RuntimePolymorphism;

public class OverRidingDemo {
	
	public static void main(String[] args) {
		RBI rbi;
		rbi = new SBI ();
		System.out.println(rbi.getRateofIntrest());
		
		rbi = new ICICI ();
		System.out.println(rbi.getRateofIntrest());
		
		rbi = new Hdfc ();
		System.out.println(rbi.getRateofIntrest());
	}

}
