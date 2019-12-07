import java.util.ArrayList;

public class Koostekomponentti implements ILaiteosa{
	
	private ArrayList<ILaiteosa> laiteenosat = new ArrayList <ILaiteosa>();
	
	public Koostekomponentti() {}
	
	public Koostekomponentti(ILaiteosa koostekomponentti) {	
		addLaiteosa(koostekomponentti);
	}
	
	@Override
	public double tulosta() {
		double hinta = 0;
		
		for(ILaiteosa i: laiteenosat) {
			hinta += i.tulosta();
		}
		return hinta;
	}

	@Override
	public void addLaiteosa(ILaiteosa laiteosa) {
		laiteenosat.add(laiteosa);		
	}
}