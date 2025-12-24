package DamageCalculator;

import movement.Movement;
import pokemon.Pokemon;

public abstract class DamageFormula {
    public abstract String calculate(Pokemon attacker, Pokemon defender, Movement move);
}
