package pokemon;

import java.util.*;

public class Pokemon {
    BasePokemon base;
    Integer level;
    Ability ability;
    Nature nature;
    Status status;
    List<Integer> ivs;
    List<Integer> evs;

    public Integer getLevel() {
        return this.level;
    }

    public Nature getNature() {
        return this.nature;
    }

    public Stats calculateMinStats() {
        return new Stats(

        );
    }

    public Stats calculateMaxStats() {
        return new Stats(

        );
    }
}
