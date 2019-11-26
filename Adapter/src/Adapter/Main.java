package Adapter;


public class Main {

	public static void main(String[] args) {

		I_CT ct = new CounterTerrorist();
		I_T t = new Terrorist();
		T_To_Ct t2ct = new T_To_Ct(t);
		
		System.out.println("Terrorist:");
		
		t.buyAK();
		t.buyGear();
		t.buyMolotov();
		
		t.loadout();
		t.getPrice();
		System.out.println(" ");
		System.out.println("CounterTerrorist:");
		
		ct.buyM4A4();
		ct.buyGear();
		ct.buyIncendiary();
		
		ct.loadout();
		ct.getPrice();
		
		System.out.println(" ");
		System.out.println("Terrorist to CounterTerrorist:");
		
		t2ct.buyM4A4();
		t2ct.buyGear();
		t2ct.buyIncendiary();
		
		t2ct.loadout();
		t2ct.getPrice();
	}
}