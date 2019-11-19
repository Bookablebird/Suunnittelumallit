import java.util.Random;

public class Arvuuttaja {
	
	private static Arvuuttaja INSTANCE = null;
	private int meme;
	Random r = new Random();
	
    public static synchronized Arvuuttaja getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Arvuuttaja();
        }
        return INSTANCE;
    }
	
	public synchronized Object liityPeliin() {
		this.meme = r.nextInt(10)+1;
		return new Memento(this.meme);		
	}
	
	public synchronized Boolean tarkistus(Object o, int arvaus) {
		Memento memento = (Memento) o;
		
		this.meme = memento.meme;
		return this.meme == arvaus;
	}
	
	private class Memento{
		private int meme;
		
		public Memento(int meme) {
				this.meme = meme;
				System.out.println("Memento = " + meme);
		}
	}


}