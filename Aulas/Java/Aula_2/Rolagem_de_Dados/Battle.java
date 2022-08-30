package PaftPucPR.Aulas.Java.Aula_2.Rolagem_de_Dados;

public class Battle {
    public static void main(String[] args){
        Char hero = new Char("Sir Gallahad", 14, 5, 80);

        Char monster = Char.createGoblin();

        System.out.println(hero.getName() + " versus " + monster.getName());
        System.out.println();

        while(hero.isAlive() && monster.isAlive()){
        hero.attack(monster);
        if(monster.getLife() <=0){
            break;
        }
        monster.attack(hero);
        System.out.println();
        }

        Char winner = hero.isAlive() ? hero : monster;
        System.out.printf("%s wins! Life: %d.\n", winner.getName(), winner.getLife());
    }
}
