package program;

import pokemon.Pokemon;
import movement.Movement;

public class DamageCalculator {
    public String calculateDamage(Pokemon attacker, Pokemon defender, Movement movement) {
        movement.calculateDamage(attacker, defender, movement);
        return "";
    }
}
