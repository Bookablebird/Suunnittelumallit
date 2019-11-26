public class Burger {

	private IBurgerBuilder burgerBuilder;

	public void setBurgerBuilder(IBurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}

	public Object getBurger() {
		return burgerBuilder.getBurger();
	}

	public void rakennaBurger() {
		burgerBuilder.Sampyla();
		burgerBuilder.Juusto();
		burgerBuilder.Suolakurkku();
		burgerBuilder.Ketsuppi();
		burgerBuilder.Pihvi();
	}
}