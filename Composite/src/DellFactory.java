public class DellFactory implements IFactory {


	@Override
	public ILaiteosa giveRAM() {
		ILaiteosa muistipiiri = new Laiteosa("Dell32GB 3200Mhz",319);
		return muistipiiri;
	}

	@Override
	public ILaiteosa giveEmolevy() {
		ILaiteosa emolevy = new Laiteosa("Dell-Emolevy",152);
		ILaiteosa emolevyKooste = new Koostekomponentti(emolevy);
		return emolevyKooste;
	}

	@Override
	public ILaiteosa giveProsessori() {
		ILaiteosa prosessori = new Laiteosa("Intel i9-9900k",799.50);
		return prosessori;
	}

	@Override
	public ILaiteosa giveVerkkokortti() {
		ILaiteosa verkkokortti = new Laiteosa("Dell-Verkkokortti",10);
		return verkkokortti;
	}

	@Override
	public ILaiteosa giveNaytonohjain() {
		ILaiteosa naytonohjain = new Laiteosa("Nvidia Gtx 2080",699);
		return naytonohjain;
	}

	@Override
	public ILaiteosa giveKotelo() {
		ILaiteosa kotelo = new Laiteosa("Dell-Kotelo",75);
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
		ILaiteosa virtalahde = new Laiteosa("Dell-Virtalahde",85);
		return virtalahde;
	}
	
	@Override
	public ILaiteosa giveTuuletin() {
		ILaiteosa tuuletin = new Laiteosa("3x Cooler master 120mm",9.99*3);
		return tuuletin;
	}

}