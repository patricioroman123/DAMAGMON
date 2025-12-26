package movement;

import DamageCalculator.DamageFormula;
import pokemon.Stats;
import pokemon.Pokemon;

public class Movement {
    protected String name;
    protected Type type;
    protected Integer power;
    protected DamageFormula formula;

    public String calculateDamage(Pokemon attacker, Pokemon defender) {
        Stats attackerMinStats = attacker.calculateMinStats();
        Stats attackerMaxStats = attacker.calculateMaxStats();
        Stats defenderMinStats = defender.calculateMinStats();
        Stats defenderMaxStats = defender.calculateMaxStats();

        double minDamage = formula.calculate(attackerMinStats, defenderMaxStats, attacker.getLevel(), this) * 0.85;
        double maxDamage = formula.calculate(attackerMaxStats, defenderMinStats, attacker.getLevel(), this);
        
        return minDamage + " - " + maxDamage;
    }

    public Integer getPower() {
        return this.power;
    }
}
