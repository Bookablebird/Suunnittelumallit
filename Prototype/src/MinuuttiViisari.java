public class MinuuttiViisari implements Cloneable {
	
	private int mm;
	
	public MinuuttiViisari() {}

	public MinuuttiViisari(int t) {
		mm = t;
	}
	
	public int getMinuutit() {
		return mm;
	}

	public void setMinuutit(int mm) {
		this.mm = mm;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}