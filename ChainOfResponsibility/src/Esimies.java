public class Esimies extends Käsittelijä {

    @Override
    protected String getKäsittelijä() {
        return "lähiesimiehelle.";
    }

    @Override
    protected double getHyväksyntä() {
        return BASE * 0.03;
    }
}