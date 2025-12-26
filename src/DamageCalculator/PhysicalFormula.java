package DamageCalculator;

import movement.Movement;
import pokemon.Stats;

public class PhysicalFormula extends DamageFormula {
    public double calculate(Stats attackerStats, Stats defenderStats, Integer attackerLevel, Movement move) {
        Integer atStat = attackerStats.getAttackStat();
        Integer defStat = defenderStats.getDefenseStat();
        Integer power = move.getPower();
        double res = (( ((2*attackerLevel/5)+2) * power * atStat/defStat ) / 50) + 2;
        return res;
    }
}
