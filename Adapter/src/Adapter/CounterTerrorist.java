package Adapter;

import java.util.ArrayList;

public class CounterTerrorist implements I_CT {
	
	private int price;
	ArrayList<String> loadout = new ArrayList<String>();
	
	
	@Override
	public void loadout() {
		System.out.println("Loadout:");
		for(String s : loadout){
			System.out.println(s);
		}
		loadout.clear();
	}
	
	@Override
	public void buyM4A4(){
		price += 3100;
		loadout.add("M4A4");
	}
	
	@Override
	public void buyGear(){
		price += 1400;
		loadout.add("Kevlar + Helmet");
		loadout.add("Defuce-kit");
	}
	
	@Override
	public void buyIncendiary(){
		price += 600;
		loadout.add("Incendiary");
	}

	@Override
	public int getPrice() {
		return price;
	}
}