public class Palkankorotus {

    private double prosentti;
    private double palkka;

    public Palkankorotus(double palkka,double prosentti) {
        this.prosentti = prosentti;
        this.palkka = palkka;
    }
    
    public double getM‰‰r‰() {
        return prosentti;
    }

    public double getPalkka() {
        return palkka;
    }
}