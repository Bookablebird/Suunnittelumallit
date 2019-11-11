public class Ham extends PizzaMaker{

	public Ham(IPizzeria pizza) {
		super(pizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice()+1;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "ham, ";
	}
}