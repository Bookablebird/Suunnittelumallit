package AbstractFactory;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//jostain syyst� t�� suostuu lukee int:in pelk�st��n oikein -.-
		//siis String in = s.next()/nextLine(); ei toimi vaikka arvo esim. "y" olisi oikein
		
	Scanner s = new Scanner(System.in);  
	System.out.println("Onko Jasper insin��ri? 1 = on, mik� tahansa muu int = ei");
	int in = s.nextInt();
	
	IFactory factory = new AdidasFactory();

	if(in == 1){
		factory = new BossFactory();
		System.out.println("Jasper the engineer vaatteet:");
	} else {
		System.out.println("Jasper opiskelija vaatteet:");
	}
	
	luettele(factory.vaatteet());
}
	private static void luettele(List<IVaate> vaatteet) {
		for(IVaate i:vaatteet) {
			System.out.println(i.toString());
		}
	}
}
