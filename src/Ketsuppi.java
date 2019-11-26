public class Ketsuppi implements IBurger {

	private String tulostus;

	public Ketsuppi(String tulostus) {
		this.tulostus = tulostus;
	}

	public String toString() {
		return tulostus;
	}
}