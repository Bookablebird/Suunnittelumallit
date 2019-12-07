public class HpFactory implements IFactory {

	@Override
	public ILaiteosa giveRAM() {
		ILaiteosa muistipiiri = new Laiteosa("HP-16GB 30000Mhz",144);
		return muistipiiri;
	}

	@Override
	public ILaiteosa giveEmolevy() {
		ILaiteosa emolevy = new Laiteosa("HP-Emolevy",110);
		ILaiteosa emolevyKooste = new Koostekomponentti(emolevy);
		return emolevyKooste;
	}

	@Override
	public ILaiteosa giveProsessori() {
		ILaiteosa prosessori = new Laiteosa("Intel i5-9670k",275.99);
		return prosessori;
	}

	@Override
	public ILaiteosa giveVerkkokortti() {
		ILaiteosa verkkokortti = new Laiteosa("HP-Verkkokortti",20);
		return verkkokortti;
	}

	@Override
	public ILaiteosa giveNaytonohjain() {
		ILaiteosa naytonohjain = new Laiteosa("Nvidia Gtx2060",299.99);
		return naytonohjain;
	}

	@Override
	public ILaiteosa giveKotelo() {
		ILaiteosa kotelo = new Laiteosa("HP-Kotelo",70);
		ILaiteosa koteloKooste = new Koostekomponentti(kotelo);
		return koteloKooste;
	}

	@Override
	public ILaiteosa giveKoostekomponentti() {
		ILaiteosa koostekomponentti = new Koostekomponentti();
		return koostekomponentti;
	}

	@Override
	public ILaiteosa giveVirtalahde() {
		ILaiteosa virtalahde = new Laiteosa("HP-Virtalahde",88);
		return virtalahde;
	}

	@Override
	public ILaiteosa giveTuuletin() {
		ILaiteosa tuuletin = new Laiteosa("3x Cooler master 120mm",9.99*3);
		return tuuletin;
	}

}