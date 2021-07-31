package fruit;

public class Banana extends Fruit{

	public Banana(String name) {
		super(name);
	}
	
	@Override
	public String taste() {
		
		return "Banana is sweet";
	}

}
