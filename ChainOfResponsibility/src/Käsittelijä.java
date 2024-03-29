public abstract class Käsittelijä {
    protected final static double BASE = 100;
    protected Käsittelijä successor;

    protected abstract String getKäsittelijä();
    protected abstract double getHyväksyntä();

    public void setSuccessor(Käsittelijä successor) {
        this.successor = successor;
    }

    public void processRequest(Palkankorotus request) {
        if(request.getMäärä() < this.getHyväksyntä()) {
            System.out.println("Palkankorotus pyyntö ohjataan " + this.getKäsittelijä());
            System.out.println("Uusi palkka on: " + getUusiPalkka(request, request.getMäärä()) + "€");

        }
        else if(successor != null) {
            successor.processRequest(request);
        }
        else System.out.println("Liian suuri pyyntö");
    }
	protected double getUusiPalkka(Palkankorotus request, double prosentti) {
		double palkka = request.getPalkka();
		double korotus = request.getMäärä();


		return palkka + (palkka * (korotus/100));
	}
}