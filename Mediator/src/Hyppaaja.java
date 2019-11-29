public class Hyppaaja {

	private int numero;
	private Hyppy[] hypyt = new Hyppy[2];

	public Hyppaaja(int numero) {
		this.numero = numero;
	}

	public Hyppy hyppaa() {
		return new Hyppy();
	}

	public int getNumero() {
		return numero;
	}

	public void lisaaHyppy(Hyppy hyppy) {
		if (hypyt[0] == null) {
			hypyt[0] = hyppy;
		}
		else{
			hypyt[1] = hyppy;
		}
	}
}