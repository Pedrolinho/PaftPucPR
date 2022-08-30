package PaftPucPR.Aulas.Java.Aula_2.Rolagem_de_Dados;

import java.util.Random;

public class DiceRoll {
    private static Random RND = new Random();

    private int dices;
    private int faces;
    private int bonus;
    private String textoJogada;

    // Construtores
    public DiceRoll(int dices, int faces, int bonus){
        this.dices = dices;
        this.faces = faces;
        this.bonus = bonus;
        this.textoJogada = "";
    }
    public DiceRoll(int dices, int faces){
        this.dices = dices;
        this.faces = faces;
        this.bonus = 0;
        this.textoJogada = "";
    }
    public DiceRoll(int faces){
        this.dices = 1;
        this.faces = faces;
        this.bonus = 0;
        this.textoJogada = "";
    }

    // Métodos Get
    public int getDices() {
        return dices;
    }
    public int getFaces() {
        return faces;
    }
    public int getBonus() {
        return bonus;
    }
    public String getTextoJogada() {
        return textoJogada;
    }

    // Métodos
    public int roll(){
        int soma = 0;
        String textoSoma = "";

        for(int x=0, dice; x<getDices(); x++){
            dice = RND.nextInt(getFaces()) + 1;
            soma = soma + dice;
            if(x == 0){
                textoSoma += dice;   
            }
            else{
                textoSoma += " + " + dice;
            }
        }
        textoJogada = "(" + textoSoma + ")";
        if(bonus > 0){
            soma += bonus;
            textoJogada += " + " + bonus;
        }

        textoJogada += " = " + soma;

        return soma;
    }

    public void imprimirJogada(){
        System.out.println(textoJogada);
    }
    public String toString(){
        if(this.bonus <= 0){
            return getDices() + "D" + getFaces();    
        }
        else{
        return getDices() + "D" + getFaces() + " + " + getBonus();
        }
    }
}
