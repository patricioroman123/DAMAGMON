package DamageCalculator;

import movement.Movement;
import pokemon.Stats;

public class SpecialFormula extends DamageFormula {
    public double calculate(Stats attackerStats, Stats defenderStats, Integer attackerLevel, Movement move) {
        Integer spAtStat = attackerStats.getSpAttackStat();
        Integer spDefStat = defenderStats.getSpDefenseStat();
        Integer power = move.getPower();
        double res = (( ((2*attackerLevel/5)+2) * power * spAtStat/spDefStat ) / 50) + 2; 
        return res;
    }
}
