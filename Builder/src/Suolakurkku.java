
public class Suolakurkku implements IBurger {

	private String tulostus;

	public Suolakurkku(String tulostus) {
		this.tulostus = tulostus;
	}

	public String toString() {
		return tulostus;
	}
}
