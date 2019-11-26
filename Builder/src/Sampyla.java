public class Sampyla implements IBurger {

	private String tulostus;

	public Sampyla(String tulostus) {
		this.tulostus = tulostus;
	}

	public String toString() {
		return tulostus;
	}
}