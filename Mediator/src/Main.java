import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	    ArrayList<Arvostelutuomari> tuomarit = new ArrayList<Arvostelutuomari>();
	    ArrayList<Hyppaaja> hypaajat = new ArrayList<Hyppaaja>();
		
		for (int i = 0; i < 5; i++) {
			tuomarit.add(new Arvostelutuomari(i));
			hypaajat.add(new Hyppaaja(i+1));
		}

		Kisasihteeri kisasihteeri = new Kisasihteeri();
		Tulostaulu tulostaulu = new Tulostaulu();
		Mittamies mittamies = new Mittamies();

		Mediator mediator = new Mediator(mittamies, tuomarit, kisasihteeri, tulostaulu);

		for(int i = 0; i < hypaajat.size(); i++){
			mediator.hyppaa(hypaajat.get(i));
			mediator.hyppaa(hypaajat.get(i));
		}

		mediator.tulostaHypyt();
	}
}