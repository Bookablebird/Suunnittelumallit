package Adapter;

import java.util.ArrayList;

public class Terrorist implements I_T {
	
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
	public void buyAK(){
		price += 2700;
		loadout.add("AK-47");
	}
	
	@Override
	public void buyGear(){
		price += 1000;
		loadout.add("Kevlar + Helmet");
	}
	
	@Override
	public void buyMolotov(){
		price += 400;
		loadout.add("Molotov");
	}

	@Override
	public int getPrice() {
		return price;
	}
}