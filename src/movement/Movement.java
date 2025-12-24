package movement;

import pokemon.Pokemon;

public abstract class Movement {
    protected String name;
    protected Type type;
    protected Integer power;

    public abstract float calculatePower(Pokemon attacker, Pokemon defender);

    public abstract float calculateDamage(Pokemon attacker, Pokemon defender);
}
