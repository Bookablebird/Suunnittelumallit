import java.util.Random;

public class AsiakasRunnable implements Runnable{

    private Object o;
    private Arvuuttaja arvuuttaja;
    private int arvaus;
    private String pelaaja;
    private Random rand;
    private int kierros = 0;

    public AsiakasRunnable(String pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    @Override
    public void run() {
        arvuuttaja = Arvuuttaja.getInstance();
        o = arvuuttaja.liityPeliin();
        rand = new Random();
        
        while (!arvuuttaja.tarkistus(o, arvaus)){
        	kierros++;
            arvaus = rand.nextInt(10)+1;
            System.out.println("Pelaaja " + pelaaja + " arvasi numeroa: " + arvaus + ", kierroksella: " + kierros);
        }
        System.out.println("Pelaaja " + pelaaja + " arvasi oikein kierroksella: " + kierros);
    }
    
}