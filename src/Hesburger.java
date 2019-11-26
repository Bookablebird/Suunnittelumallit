public class Hesburger implements IBurgerBuilder {

	private StringBuilder kerroshampurilainen;

	public Hesburger() {
		kerroshampurilainen = new StringBuilder();
	}

	@Override
	public void Sampyla() {
		kerroshampurilainen.append("Leipä seesaminsiemenillä\n");
	}

	@Override
	public void Juusto() {
		kerroshampurilainen.append("Sama pska juusto\n");
	}
	
	@Override
	public void Suolakurkku() {
		kerroshampurilainen.append("Suolakurkku\n");
	}

	@Override
	public void Ketsuppi() {
		kerroshampurilainen.append("Sama pska ketsuppi\n");
	}

	@Override
	public void Pihvi() {
		kerroshampurilainen.append("Sama hk pihvi\n");
	}

	@Override
	public Object getBurger() {
		return kerroshampurilainen;
	}
}