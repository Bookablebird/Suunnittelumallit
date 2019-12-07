public class Laiteosa implements ILaiteosa{
	
	private String nimi;
	private double hinta;
	
	public Laiteosa(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}

	public void addLaiteosa(ILaiteosa laiteosa) {
		throw new RuntimeException
		("Error");
	}

	public double tulosta() {
		System.out.println(nimi + " hinta on "+ hinta +"€");
		return hinta;
	}

}