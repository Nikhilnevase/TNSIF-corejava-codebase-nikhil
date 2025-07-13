package CovarientOverride;

public class Blue extends Colour {
	
	public Blue(String colour1, String colour2, String colour3) {
		super(colour1, colour2, colour3);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	protected Blue getcolour() {
		Blue s = new Blue(colour1, colour1, colour1);
		return s;
	}
	
	

}
