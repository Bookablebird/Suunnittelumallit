package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class MainReflection {

	public static void main(String[] args) {
		Class c = null;
		IFactory factory = null;
		String tehdas = "AbstractFactory.AdidasFactory";

		
		Scanner s = new Scanner(System.in);  
		System.out.println("Onko Jasper insinööri? 1 = on, mikä tahansa muu int = ei");
		int in = s.nextInt();
		
		if(in == 1){
			tehdas = "AbstractFactory.BossFactory";
			System.out.println("Jasper the engineer vaatteet:");
		} else {
			System.out.println("Jasper opiskelija vaatteet:");
		}
		
		try {
			c = Class.forName(tehdas);
			factory = (IFactory) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		luettele(factory.vaatteet());
	}
		private static void luettele(List<IVaate> vaatteet) {
			for(IVaate i:vaatteet) {
				System.out.println(i.toString());
			}
	}
}