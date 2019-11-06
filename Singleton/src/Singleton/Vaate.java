package Singleton;

public class Vaate implements IVaate {
	private String vaatekappale;
	private String merkki;

	public Vaate(String vaatekappale, String merkki) {
		this.vaatekappale = vaatekappale;
		this.merkki = merkki;
	}

	public String toString() {
		return vaatekappale + " merkkiä " + merkki;
	}
}