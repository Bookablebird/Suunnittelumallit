import java.util.Random;

public class Arvostelutuomari {

	private int i;

	public Arvostelutuomari(int i) {
		this.i = i;
	}

	public int arvosteleHyppy(Hyppy hyppy) {
		int rand = new Random().nextInt(100);
		int a = hyppy.getPituus() + rand;
		return a;

	}
}