package PaftPucPR.Aulas.Java.Aula_9.FixedRoll.items;

import PaftPucPR.Aulas.Java.Aula_9.FixedRoll.system.DiceRoll;
import PaftPucPR.Aulas.Java.Aula_9.FixedRoll.system.Rollable;

public class Weapon {
    public static final Weapon FISTS = new Weapon("Fists", new DiceRoll(0, 1, 1));
    private String name;
    private Rollable damage;

    public Weapon(String name, Rollable damage) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("You must provide a name!");
        }
        if (damage == null) {
            throw new IllegalArgumentException("Damage cannot be null!");
        }

        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Rollable getDamage() {
        return damage;
    }

    public int roll() {
        return damage.roll();
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, damage);
    }
}
