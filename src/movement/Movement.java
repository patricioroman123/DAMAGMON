package movement;

import DamageCalculator.DamageFormula;
import pokemon.Pokemon;

public class Movement {
    protected String name;
    protected Type type;
    protected Integer power;
    protected DamageFormula formula;

    public String calculateDamage(Pokemon attacker, Pokemon defender, Movement movement) {
        return formula.calculate(attacker, defender, movement);
    }
}
