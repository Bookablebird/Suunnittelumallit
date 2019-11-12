package State;

public class Charmander implements PokemonState {

    @Override
    public void next(Pokemon pkmn) {
    	pkmn.setState(new Charmaleon());
    }

    @Override
    public void prev(Pokemon pkmn) {
        System.out.println("Charmander is the base form.");
    }

    @Override
    public void printStatus() {
        System.out.println("Charmander.");
    }

    public void ember(){
    	System.out.println("ember");
    }
    public void scratch(){
    	System.out.println("scratch");
    }    
    public void growl(){
    	System.out.println("growl");
    }
    public void flash(){
    	System.out.println("flash");
    }
    public void attackMoves(){
    	System.out.println("Attack moves:");
    	
    	ember();
    	scratch();
    	growl();
    	flash();
    	System.out.println(" ");
    }
}