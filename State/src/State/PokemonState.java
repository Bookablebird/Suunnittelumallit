package State;

public interface PokemonState {

    void next(Pokemon pkmn);
    void prev(Pokemon pkmn);
    void printStatus();
    void attackMoves();
}