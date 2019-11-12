package State;

public class Charizard implements PokemonState {

    @Override
    public void next(Pokemon pkmn) {
        System.out.println("Charizard is the final form.");
    }

    @Override
    public void prev(Pokemon pkmn) {
    	pkmn.setState(new Charmaleon());
    }

	@Override
	public void printStatus() {
        System.out.println("Charizard.");
	}
	
    public void flamethrower(){
    	System.out.println("Flamethrower");
    }
    public void fly(){
    	System.out.println("Fly");
    }    
    public void swift(){
    	System.out.println("Swift");
    }
    public void fireBlast(){
    	System.out.println("Fire blast");
    }
    public void attackMoves(){
    	System.out.println("Attack moves:");
    	
    	flamethrower();
    	fly();
    	fireBlast();
    	swift();
    	System.out.println(" ");

    }
}