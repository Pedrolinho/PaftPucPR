package PaftPucPR.Aulas.Java.Aula_2.Battle;

public class Battle {
    public static void main(String[] args){
        Char hero = new Char();
        hero.name = "Sir Gallahad";
        hero.skill = 14;
        hero.defense = 5;
        hero.life = 80;
        
        Char monster = Char.createGoblin();

        System.out.println(hero.name + " versus " + monster.name);
        System.out.println();

        while(hero.life > 0 && monster.life > 0){
        hero.attack(monster);
        monster.attack(hero);
        System.out.println();
        }
        if(hero.life > 0){
            System.out.printf("%s wins!\n", hero.name, hero.life);
        }
        else{
            System.out.printf("%s wins!\n", monster.name, monster.life);
        }
    }
}
