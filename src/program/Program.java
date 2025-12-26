package program;

import java.util.*;

import DamageCalculator.DamageCalculator;
import ability.Ability;
import pokemon.Pokemon;
import pokemon.BasePokemon;
import pokemon.Item;
import movement.Movement;

public class Program {
    private List<BasePokemon> base_pokemons;
    private List<Movement> movements;
    private List<Ability> abilities;
    private List<Item> objects;
    private DamageCalculator dmgCalculator;

    public Program(
        List<BasePokemon> base_pokemons,
        List<Movement> movements, 
        List<Ability> abilities,
        List<Item> objects,
        DamageCalculator dmgCalculator
    ) {
        this.base_pokemons = base_pokemons;
        this.movements = movements;
        this.abilities = abilities;
        this.objects = objects;
        this.dmgCalculator = dmgCalculator;
    }

    public String calculate(Pokemon attacker, Pokemon defender, Movement movement) {
        return dmgCalculator.calculateDamage(attacker, defender, movement);
    }

    public List<BasePokemon> getBasePokemons() {
        return base_pokemons;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<Item> getObjects() {
        return objects;
    }
}
