package Adapter;

public class T_To_Ct implements I_CT {

	private I_T tero;

	public T_To_Ct(I_T tero) {
		this.tero = tero;
	}

	@Override
	public void buyM4A4() {
		tero.buyAK();
	}

	@Override
	public void buyGear() {
		tero.buyGear();
	}
	
	@Override
	public void buyIncendiary() {
		tero.buyMolotov();
	}

	@Override
	public void loadout() {
		tero.loadout();
	}
	@Override
	public int getPrice() {
		return tero.getPrice();
	}
	
	
}