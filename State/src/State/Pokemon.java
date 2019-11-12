package State;

public class Pokemon {

    private PokemonState state = new Charmander();


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

	public PokemonState getState() {
		return state;
	}

	public void setState(PokemonState state) {
		this.state = state;
	}

	public void attackMoves() {
		state.attackMoves();
	}
	
	
}
