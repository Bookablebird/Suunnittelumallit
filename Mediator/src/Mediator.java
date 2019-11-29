import java.util.ArrayList;

public class Mediator {

	private Mittamies mittamies;
	private ArrayList<Arvostelutuomari> tuomarit;
	private Kisasihteeri kisasihteeri;
	private Tulostaulu tulostaulu;

	public Mediator(Mittamies mittamies, ArrayList<Arvostelutuomari> tuomarit, Kisasihteeri kisasihteeri, Tulostaulu tulostaulu) {
		this.mittamies = mittamies;
		this.tuomarit = tuomarit;
		this.kisasihteeri = kisasihteeri;
		this.tulostaulu = tulostaulu;
	}

	public void hyppaa(Hyppaaja hyppaaja) {

		Hyppy hyppy = hyppaaja.hyppaa();
		hyppy = mittamies.mittaaHyppy(hyppy);

		ArrayList<Integer> pisteet = new ArrayList<Integer>();
		for (int i = 0; i < tuomarit.size(); i++) {
			pisteet.add(tuomarit.get(i).arvosteleHyppy(hyppy));
		}
		
		hyppy = kisasihteeri.laskePisteet(pisteet, hyppy);

		hyppaaja.lisaaHyppy(hyppy);

		tulostaulu.lisaaTulosrivi(new Tulosrivi(hyppaaja, hyppy));
	}

	public void tulostaHypyt() {
		tulostaulu.tulosta();
	}
}