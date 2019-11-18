public class CEO extends Käsittelijä {
    
    @Override
    protected String getKäsittelijä() {
        return "toimitusjohtajalle.";
    }
    
    @Override
    protected double getHyväksyntä() {
        return BASE * 1.0;
    }
}