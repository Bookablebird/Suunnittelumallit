import java.util.ArrayList;

public class Kisasihteeri {

	public Hyppy laskePisteet(ArrayList<Integer> pisteet, Hyppy hyppy) {
		int summa = 0;
		for (int piste : pisteet) {
			summa += piste;
		}
		hyppy.setPisteet(summa / pisteet.size());
		return hyppy;
	}
}