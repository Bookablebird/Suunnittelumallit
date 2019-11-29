import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Kello> kellot = new ArrayList<Kello>();

		kellot.add(new Kello());
		kellot.add(kellot.get(0).clone());

		kellot.get(1).setSekunnit(60);

		Runnable aika = () -> {
			while (true) {
				for (Kello k : kellot) {
					k.setSekunnit(k.getSekunnit() + 1);
					k.tulostaAika();
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(aika);
		thread.start();
	}
}