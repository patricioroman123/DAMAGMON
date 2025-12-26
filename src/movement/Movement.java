package movement;

import DamageCalculator.DamageFormula;
import pokemon.Stats;
import pokemon.Pokemon;

public class Movement {
    protected String name;
    protected Type type;
    protected Integer power;
    protected DamageFormula formula;

    public Integer getPower() {
        return this.power;
    }

    public String calculateDamage(Pokemon attacker, Pokemon defender) {
        Stats attackerMinStats = attacker.getMinStats();
        Stats attackerMaxStats = attacker.getMaxStats();
        Stats defenderMinStats = defender.getMinStats();
        Stats defenderMaxStats = defender.getMaxStats();

        double minDamage = formula.calculate(attackerMinStats, defenderMaxStats, attacker.getLevel(), this) * 0.85;
        double maxDamage = formula.calculate(attackerMaxStats, defenderMinStats, attacker.getLevel(), this);
        
        return minDamage + " - " + maxDamage;
    }
}
