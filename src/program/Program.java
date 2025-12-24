package program;

import java.util.*;

import pokemon.Pokemon;
import pokemon.BasePokemon;
import pokemon.Ability;
import pokemon.Item;
import movement.Movement;

public class Program {
    List<BasePokemon> pokemons;
    List<Movement> movements;
    List<Ability> abilities;
    List<Item> objetcs;
    DamageCalculator dmgCalculator;

    public String calculate(Pokemon attacker, Pokemon defender, Movement movement) {
        return dmgCalculator.calculateDamage(attacker, defender, movement);
    }
}
