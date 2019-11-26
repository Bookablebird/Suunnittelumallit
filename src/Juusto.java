public class Juusto implements IBurger {

	private String tulostus;

	public Juusto(String tulostus) {
		this.tulostus = tulostus;
	}

	public String toString() {
		return tulostus;
	}
}