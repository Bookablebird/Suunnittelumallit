public abstract class K‰sittelij‰ {
    protected final static double BASE = 100;
    protected K‰sittelij‰ successor;

    protected abstract String getK‰sittelij‰();
    protected abstract double getHyv‰ksynt‰();

    public void setSuccessor(K‰sittelij‰ successor) {
        this.successor = successor;
    }

    public void processRequest(Palkankorotus request) {
        if(request.getM‰‰r‰() < this.getHyv‰ksynt‰()) {
            System.out.println("Palkankorotus pyyntˆ ohjataan " + this.getK‰sittelij‰());
            System.out.println("Uusi palkka on: " + getUusiPalkka(request, request.getM‰‰r‰()) + "Ä");

        }
        else if(successor != null) {
            successor.processRequest(request);
        }
        else System.out.println("Liian suuri pyyntˆ");
    }
	protected double getUusiPalkka(Palkankorotus request, double prosentti) {
		double palkka = request.getPalkka();
		double korotus = request.getM‰‰r‰();


		return palkka + (palkka * (korotus/100));
	}
}