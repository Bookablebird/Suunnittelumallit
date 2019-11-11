public abstract class PizzaMaker implements IPizzeria{
	private final IPizzeria pizza;

	public PizzaMaker(IPizzeria pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}
}