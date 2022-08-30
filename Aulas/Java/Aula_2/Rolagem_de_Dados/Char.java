package PaftPucPR.Aulas.Java.Aula_2.Rolagem_de_Dados;

import java.util.Random;

public class Char{
    private static final Random RND = new Random();

    private String name;
    private int skill;
    private int defense;
    private int life;

    public Char(String name, int skill, int defense, int life){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Insira um valor no nome!");
        }
        this.name = name;
        if(skill <= 0){
            throw new IllegalArgumentException("Invalid Skill: " + skill);
        }
        this.skill = skill;
        if(defense <= 0){
            throw new IllegalArgumentException("Invalid Defense: " + defense);
        }
        this.defense = defense;
        if(life <= 0){
            life = 0;
        }
        this.life = life;
    }

    static Char createGoblin(){
        DiceRoll skillRoll = new DiceRoll(1, 6, 10);
        DiceRoll defenseRoll = new DiceRoll(1, 8, 3);
        DiceRoll lifeRoll = new DiceRoll(1, 21, 30);
        
        String[] names = {"Spitz", "Gob", "Uga", "Dandar"};
        String[] surnames = {"the Weak", "Baggins", "the Ugly", "son of Arathorn"};

        String name = names[RND.nextInt(names.length)] + " " + surnames[RND.nextInt(surnames.length)];
        int skill = skillRoll.roll();
        int defense = defenseRoll.roll();
        int life = lifeRoll.roll();

        Char Goblin = new Char(name, skill, defense, life);
        return Goblin;
    }

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


    void attack(Char enemy){

        DiceRoll rollAttack = new DiceRoll(3, 6);

        if(enemy == null){
            throw new IllegalArgumentException("You must provide the enemy!");
        }
        //if(getLife() <= 0){
        //    throw new IllegalStateException("Cannot attack while dead!");
        //}
        System.out.printf("%s attacks %s: ", name, enemy.name);
        
        int roll = rollAttack.roll();
        int goal = skill - enemy.defense;

        if(roll <= goal){
            System.out.printf("%s, HIT!\n", rollAttack.getTextoJogada());
            int damage = RND.nextInt(6) + 1;
            enemy.takeDamage(damage);
        }
        else{
            System.out.printf("%s, MISS!\n", rollAttack.getTextoJogada());
        }
    }


    void takeDamage(int damage){
        if(damage < 0) damage = 0;
        life -= damage;
        if(life < 0) life = 0;
        System.out.printf("%s took %d damage. Life: %d\n", name, damage, life);
    }

    public boolean isAlive(){
        return life > 0;
    }
}