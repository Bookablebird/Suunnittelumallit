public class Kello implements Cloneable{

	private TuntiViisari hh;
	private MinuuttiViisari mm;
	private SekunttiViisari ss;
	
	public Kello() {
		hh = new TuntiViisari();
		mm = new MinuuttiViisari();
		ss = new SekunttiViisari();
	}

	public void setTunnit(int h) {
		if(h == 24){
			hh.setTunnit(0);
		}
		else{
		hh.setTunnit(h);
		}
	}

	public void setMinuutit(int m) {
		if(m == 60){
			hh.setTunnit(hh.getTunnit()+1);
			mm.setMinuutit(0);
		}
		else{
		mm.setMinuutit(m);
		}
	}

	public void setSekunnit(int s) {
		if(s == 60){
			mm.setMinuutit(mm.getMinuutit()+1);
			ss.setSekunttit(0);
		}
		else{
		ss.setSekunttit(s);
		}
	}

	public int getTunnit() {
		return hh.getTunnit();
	}

	public int getMinuutit() {
		return mm.getMinuutit();
	}

	public int getSekunnit() {
		return ss.getSekunttit();
	}

	public void tulostaAika() {
		System.out.println(hh.getTunnit() + ":" + mm.getMinuutit() + "." + ss.getSekunttit());
	}

	public Kello clone() {
		Kello k = null;

		try {
			k = (Kello)super.clone();
			k.hh = (TuntiViisari)hh.clone();
			k.mm = (MinuuttiViisari)mm.clone();
			k.ss = (SekunttiViisari)ss.clone();
		}catch(CloneNotSupportedException e) {}

		return k;
	}
}