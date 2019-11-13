package State;

public class Charmaleon implements PokemonState {

    @Override
    public void next(Pokemon pkmn) {
    	pkmn.setState(new Charizard());
    }

    @Override
    public void prev(Pokemon pkmn) {
    	pkmn.setState(new Charmander());
    }

    @Override
    public void printStatus() {
        System.out.println("Charmaleon.");
    }
    
    public void burn(){
    	System.out.println("burn");
    }
    public void tackle(){
    	System.out.println("tackle");
    }    
    public void scaryFace(){
    	System.out.println("scary face");
    }
    public void flash(){
    	System.out.println("flash");
    }
    public void attackMoves(){
    	System.out.println("Attack moves:");
    	
    	burn();
    	tackle();
    	scaryFace();
    	flash();
    	System.out.println(" ");

    }
    
}
