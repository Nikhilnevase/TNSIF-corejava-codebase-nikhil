 package CovarientOverride;

public class Red extends Colour {
	
	public Red(String colour1, String colour2, String colour3) {
		super(colour1, colour2, colour3);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	protected Red getcolour() {
		Red s = new Red(colour1, colour1, colour1);
		
		return s;
	}

}

