package PaftPucPR.Aulas.Java.Aula_4;

import PaftPucPR.Aulas.Java.Aula_4.items.Weapon;
import PaftPucPR.Aulas.Java.Aula_4.system.Char;
import PaftPucPR.Aulas.Java.Aula_4.system.DiceRoll;

public class Battle {
    public static void main(String[] args) {
        Char hero = new Char("Sir Gallahad",
                14, 5, 80);
        hero.setWeapon(new Weapon("Excalibur", new DiceRoll(1, 6, 3)));

        Char monster = Char.createGoblin();

        System.out.println(hero.getName() + " versus " + monster.getName());

        while (hero.isAlive() && monster.isAlive()) {
            if(hero.getLife() <= 2){
                hero.heal();   
            }
            else{
                hero.attack(monster);   
            }
            if (monster.isAlive()) {
                monster.attack(hero);
            }
            System.out.println();
        }

        Char winner = hero.isAlive() ? hero : monster;
        System.out.printf("%s wins! Life: %d%n",
                winner.getName(), winner.getLife());
    }
}
