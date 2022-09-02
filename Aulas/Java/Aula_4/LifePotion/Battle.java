package PaftPucPR.Aulas.Java.Aula_4.LifePotion;

import PaftPucPR.Aulas.Java.Aula_4.LifePotion.items.Potion;
import PaftPucPR.Aulas.Java.Aula_4.LifePotion.items.Weapon;
import PaftPucPR.Aulas.Java.Aula_4.LifePotion.system.Char;
import PaftPucPR.Aulas.Java.Aula_4.LifePotion.system.DiceRoll;

public class Battle {
    public static void main(String[] args) {
        Char hero = new Char("Sir Gallahad", 14, 5, 80, new Potion(2));
        hero.setWeapon(new Weapon("Excalibur", new DiceRoll(1, 6, 3)));

        Char monster = Char.createGoblin();

        System.out.println(hero.getName() + " versus " + monster.getName());
        System.out.println();

        while (hero.isAlive() && monster.isAlive()) {
            if((hero.getLife() <= 2 || hero.getLife() <= hero.getMax_life()/4) && hero.getQuantityPotions() > 0){
                hero.heal(hero.getPotion());   
            }
            else{
                hero.attack(monster);   
            }
            if (monster.isAlive()) {
                if((monster.getLife() <= 2 || monster.getLife() <= monster.getMax_life()/4) && monster.getQuantityPotions() > 0){
                    monster.heal(monster.getPotion());   
                }
                else{
                    monster.attack(hero);    
                } 
            }
            System.out.println();
        }

        Char winner = hero.isAlive() ? hero : monster;
        System.out.printf("%s wins! Life: %d%n",
                winner.getName(), winner.getLife());
    }
}
