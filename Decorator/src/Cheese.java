public class Cheese extends PizzaMaker{

	public Cheese(IPizzeria pizza) {
		super(pizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice()+0.5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "cheese, ";
	}
}