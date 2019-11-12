package State;

public class Main {

    public static void main(String[] args) {

    	Pokemon pkmn = new Pokemon();
    	pkmn.printStatus();
    	pkmn.attackMoves();

    	pkmn.nextState();
    	pkmn.printStatus();
    	pkmn.attackMoves();


    	pkmn.nextState();
    	pkmn.printStatus();
    	pkmn.attackMoves();


    	pkmn.nextState();
    	pkmn.printStatus();
    }
}