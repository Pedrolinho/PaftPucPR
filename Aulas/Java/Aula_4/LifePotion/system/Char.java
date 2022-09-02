package PaftPucPR.Aulas.Java.Aula_4.LifePotion.system;

import PaftPucPR.Aulas.Java.Aula_4.LifePotion.items.Potion;
import PaftPucPR.Aulas.Java.Aula_4.LifePotion.items.Weapon;

public class Char {
    // Atributos
    private String name;
    private int skill;
    private int defense;
    private int life;
    private int max_life;
    private Potion potion;
    private int quantityPotions;
    private Weapon weapon = Weapon.FISTS;

    // Construtores
    public Char(String name, int skill, int defense, int life, Potion potion) {
        // Erros
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank!");
        }

        if (skill <= 0) {
            throw new IllegalArgumentException("Invalid skill: " + skill);
        }

        if (defense <= 0) {
            throw new IllegalArgumentException("Invalid defense: " + skill);
        }

        if (life <= 0) {
            life = 0;
        }

        this.name = name;
        this.skill = skill;
        this.defense = defense;
        this.life = life;
        this.max_life = life;
        this.potion = potion;
        this.quantityPotions = potion.getQuantity();
    }

    public Char(int skill, int defense, int life, Potion potion) {
        this("John Doe", skill, defense, life, potion);
        this.max_life = life;
        this.quantityPotions = potion.getQuantity();
    }

    // Criador de Goblin
    public static Char createGoblin() {
        String name =
            DiceRoll.roll("Spitz", "Gob", "Uga", "Dandar") + " " +
            DiceRoll.roll("the weak", "Baggins", "the ugly", "son of Arathorn");
        int skill = new DiceRoll(1, 10, 5).roll();
        int defense = new DiceRoll(1, 8, 3).roll();
        int life = new DiceRoll(2, 10, 30).roll();
        Potion potion = new Potion(1);

        return new Char(name, skill, defense, life, potion);
    }

    // Getters 
    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public int getDefense() {
        return defense;
    }
    public int getLife() {
                return life;
            }

    public double getMax_life() {
        return max_life;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Potion getPotion() {
        return potion;
    }

    public int getQuantityPotions() {
        return quantityPotions;
    }

    // Setters
    public void setDefense(int defense) {
        if (defense <= 0) {
            throw new IllegalArgumentException("Invalid defense: " + skill);
        }

        this.defense = defense;
    }

    public void setWeapon(Weapon weapon) {
        if (weapon == null) weapon = Weapon.FISTS;
        this.weapon = weapon;
    }

    // Ações
    public void attack(Char enemy) {
        if (enemy == null) {
            throw new IllegalArgumentException("You must provide an enemy!");
        }
        if (getLife() <= 0) {
            throw new IllegalStateException("Cannot attack while dead.");
        }

        String weaponName = weapon.getName();

        System.out.printf("%s attacks %s with %s%s%s: ", name, enemy.name, ConsoleColors.BLUE, weaponName, ConsoleColors.RESET);

        int roll = new DiceRoll(3, 6).roll();

        int goal = skill - enemy.defense;
        if (roll <= goal) {
            System.out.printf("%sHIT!%s\n", ConsoleColors.GREEN, ConsoleColors.RESET);
            enemy.takeDamage(weapon.roll());
        } else {
            System.out.printf("%sMISS!%s\n", ConsoleColors.RED, ConsoleColors.RESET);
        }
    }
    public void takeDamage(int damage) {
        if (damage < 0) damage = 0;

        life = life - damage;
        if (life < 0) {
            life = 0;
        }

        System.out.printf("%s took %d damage. Life: %d%n",
                name, damage, life);
    }

    public void heal(Potion potion) {
        DiceRoll Heal = new DiceRoll(1, 6);
        int gole = Heal.roll();
        
        if((max_life - life) < gole){
            gole = max_life - life;
            
        }
        if(potion.getLife_points() < gole){
            gole = potion.getLife_points();
        }

        life += gole;
        potion.setLife_points(potion.getLife_points() - gole);

        if(potion.getLife_points() <= 0){
            quantityPotions -= 1;
            potion.setLife_points(10);
        }

        System.out.printf("%s%s healed %d of his own life. Life: %d\n%s", ConsoleColors.YELLOW, name, gole, life, ConsoleColors.RESET);
    }

    public boolean isAlive() {
        return life > 0;
    }
}
