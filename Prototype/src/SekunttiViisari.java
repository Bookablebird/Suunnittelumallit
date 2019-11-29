public class SekunttiViisari implements Cloneable {

	private int ss;

	public SekunttiViisari() {}

	public SekunttiViisari(int t) {
		ss = t;
	}

	public int getSekunttit() {
		return ss;
	}

	public void setSekunttit(int ss) {
		this.ss = ss;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}