public class Base implements IPizzeria{

	@Override
	public double getPrice() {
		return 4.5;
	}

	@Override
	public String getDescription() {
		return "Toppings: ";
	}


}