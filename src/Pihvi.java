
public class Pihvi implements IBurger {

	private String tulostus;

	public Pihvi(String tulostus) {
		this.tulostus = tulostus;
	}
	
	public String toString() {
		return tulostus;
	}
}