public class Tulosrivi {

	private int hyppaajanNumero;
	private int hypynPisteet;
	private int hypynPituus;

	public Tulosrivi(Hyppaaja hyppaaja, Hyppy hyppy) {
		this.hyppaajanNumero = hyppaaja.getNumero();
		this.hypynPisteet = hyppy.getPisteet();
		this.hypynPituus = hyppy.getPituus();
	}

	public String toString() {
		return "Hyppaaja Nro: " + hyppaajanNumero +  "\n" + "Hyppy: Pituus: " + hypynPituus + ", Pisteet: " + hypynPisteet + "\n";
	}
}