package PaftPucPR.Aulas.Java.Aula_2.Rolagem_de_Dados;

import java.util.Random;

public class DiceRoll {
    private static Random RND = new Random();

    int dices;
    int faces;
    int bonus;

    void roll(){
        int soma = 0;

        for(int x=0, dice; x<dices; x++){
            dice = RND.nextInt(faces) + 1;
            soma = soma + dice;
        }

        if(bonus > 0){
            soma += bonus;
        }
    }

    //String toString(){
    //    String oi = "Oi";
    //    return oi;
    //}
}
