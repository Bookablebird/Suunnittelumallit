import java.util.Random;

public class Mittamies {

	public Hyppy mittaaHyppy(Hyppy hyppy) {
		hyppy.setPituus(pituus());
		return hyppy;
	}

	private int pituus() {
		return 70 + new Random().nextInt(60);
	}
}