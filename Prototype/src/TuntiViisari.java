public class TuntiViisari implements Cloneable {

	private int hh;

	public TuntiViisari() {}

	public TuntiViisari(int t) {
		hh = t;
	}
	
	public int getTunnit() {
		return hh;
	}

	public void setTunnit(int hh) {
		this.hh = hh;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}