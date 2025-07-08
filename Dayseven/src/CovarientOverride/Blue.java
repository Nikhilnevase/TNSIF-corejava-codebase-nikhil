package CovarientOverride;

public class Blue extends Colour {
	
	@Override
	
	protected Blue getcolour() {
		Blue s = new Blue();
		return s;
	}

}
