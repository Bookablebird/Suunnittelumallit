public class Bacon extends PizzaMaker{
	public Bacon(IPizzeria pizza) {
		super(pizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice()+1;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "bacon, ";
	}
}