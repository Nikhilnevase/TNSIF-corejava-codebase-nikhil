package CovarientOverride;

public class Colour {
	String colour1;
	String colour2;
	String colour3;
	
	
	public Colour(String colour1, String colour2, String colour3) {
		super();
		this.colour1 = colour1;
		this.colour2 = colour2;
		this.colour3 = colour3;
		
	}


	protected Colour getcolour() {
		Colour s = new Colour(colour1, colour2, colour3);
		
		
		return s;
	}


	@Override
	public String toString() {
		return "Colour [colour1=" + colour1 + ", colour2=" + colour2 + ", colour3=" + colour3 + "]";
	}

	
	
	
}
     