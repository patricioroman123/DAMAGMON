package DamageCalculator;

import movement.Movement;
import pokemon.Stats;

public abstract class DamageFormula {
    public abstract double calculate(Stats attackerStats, Stats defenderStats, Integer level, Movement move);
}
