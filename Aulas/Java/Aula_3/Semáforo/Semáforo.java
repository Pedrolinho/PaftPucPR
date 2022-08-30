package PaftPucPR.Aulas.Java.Aula_3.Semáforo;

public class Semáforo {
    public static final int verde = 0;
    public static final int amarelo = 1;
    public static final int vermelho = 2;

    private int cor;

    // Construtores
    public Semáforo(int cor){
        this.cor = cor;
    }

    public Semáforo(){
        this.cor = vermelho;
    }

    // Métodos
    void PróximaCor(){
        if(getCor() == Semáforo.vermelho){
            this.cor = verde;
            return;
        }
        if(getCor() == Semáforo.verde){
            this.cor = amarelo;
            return;
        }
        if(getCor() == Semáforo.amarelo){
            this.cor = vermelho;
            return;
        }
    }


    void setCor(int cor){
        if(cor == verde){
            this.cor = verde;
        }
        else if(cor == amarelo){
            this.cor = amarelo;
        }
        else if(cor == vermelho){
            this.cor = vermelho;
        }
        else{
            throw new IllegalArgumentException("Cor inválida!");
        }
    }


    int getCor(){
        return cor;
    }


    String getColorText(){
        String ColorText = null;

        if(getCor() == 0){
            ColorText = "verde";
        }
        else if(getCor() == 1){
            ColorText = "amarelo";
        }
        else if (getCor() == 2){
            ColorText = "vermelho";
        }
        else{
            throw new IllegalArgumentException("Cor inválida!");
        }
        return ColorText;
    }
}
