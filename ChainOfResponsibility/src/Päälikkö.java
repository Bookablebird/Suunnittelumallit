public class Päälikkö extends Käsittelijä {
    
    @Override
    protected String getKäsittelijä() {
        return "yksinkön päälikölle.";
    }
    
    @Override
    protected double getHyväksyntä() {
        return BASE * 0.06;
    }
}