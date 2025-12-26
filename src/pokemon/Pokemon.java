package pokemon;

import ability.Ability;

public class Pokemon {
    BasePokemon base;
    Integer level;
    Ability ability;
    Nature nature;
    Status status;
    Stats minStats;
    Stats maxStats;

    public Integer getLevel() {
        return this.level;
    }

    public Nature getNature() {
        return this.nature;
    }

    public Stats getMinStats() {
        return this.minStats;
    }

    public Stats getMaxStats() {
        return this.maxStats;
    }
}
