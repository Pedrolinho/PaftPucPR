package PaftPucPR.Aulas.Java.Aula_8.Encontro;

import PaftPucPR.Aulas.Java.Aula_8.Encontro.items.Potion;
import PaftPucPR.Aulas.Java.Aula_8.Encontro.items.Weapon;
import PaftPucPR.Aulas.Java.Aula_8.Encontro.system.Char;
import PaftPucPR.Aulas.Java.Aula_8.Encontro.system.DiceRoll;

public class Battle {
    public static void main(String[] args) {
        Party desafiantes = new Party();
        Party desafiados = new Party();

        Char hero1 = new Char("Sir Gallahad", 14, 5, 80, new Potion(2));
        Char hero2 = new Char("Agostinho Carrara", 20, 10, 30, new Potion(4));
        Char hero3 = new Char("Vinicius Godoy", 40, 7, 20, new Potion(6));
        hero1.setWeapon(new Weapon("Excalibur", new DiceRoll(1, 6, 3)));
        hero2.setWeapon(new Weapon("Atropelamento", new DiceRoll(1, 0, 7)));
        hero3.setWeapon(new Weapon("Java", new DiceRoll(1, 10)));

        Char monster1 = Char.createGoblin();
        Char monster2 = Char.createGoblin();
        Char monster3 = Char.createGoblin();
        Char hero4 = new Char("Kratos", 5, 5, 500, new Potion(0));
        hero4.setWeapon(new Weapon("Garfo", new DiceRoll(1, 0, 1)));
        desafiantes.add(hero1);desafiantes.add(hero2);desafiantes.add(hero3);
        desafiados.add(hero4);desafiados.add(monster1);desafiados.add(monster2);desafiados.add(monster3);

        Char monster = Char.createGoblin();

        System.out.println(hero1.getName() + " versus " + monster.getName());
        System.out.println();

        while (hero1.isAlive() && monster.isAlive()) {
            if((hero1.getLife() <= 2 || hero1.getLife() <= hero1.getMax_life()/4) && hero1.getQuantityPotions() > 0){
                hero1.heal(hero1.getPotion());   
            }
            else{
                hero1.attack(monster);   
            }
            if (monster.isAlive()) {
                if((monster.getLife() <= 2 || monster.getLife() <= monster.getMax_life()/4) && monster.getQuantityPotions() > 0){
                    monster.heal(monster.getPotion());   
                }
                else{
                    monster.attack(hero1);    
                } 
            }
            System.out.println();
        }

        Char winner = hero1.isAlive() ? hero1 : monster;
        System.out.printf("%s wins! Life: %d%n",
                winner.getName(), winner.getLife());
    }
}
