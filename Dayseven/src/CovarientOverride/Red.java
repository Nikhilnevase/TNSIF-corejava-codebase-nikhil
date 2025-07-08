 package CovarientOverride;

public class Red extends Colour {
	
	@Override
	
	protected Red getcolour() {
		Red s = new Red();
		return s;
	}

}

