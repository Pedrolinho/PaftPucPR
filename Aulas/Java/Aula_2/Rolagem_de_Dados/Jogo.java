package PaftPucPR.Aulas.Java.Aula_2.Rolagem_de_Dados;

public class Jogo {
    public static void main(String[] args) {

        // Objetos
        DiceRoll jogada_1 = new DiceRoll(3, 6, 2); // Parâmetros - Dices, faces e Bonus
        DiceRoll jogada_2 = new DiceRoll(5, 5); // Parâmetros - Dices e faces
        DiceRoll jogada_3 = new DiceRoll(12); // Parâmetros - Faces

        // Jogadas
        System.out.println("Jogada 1");
        System.out.println(jogada_1);
        jogada_1.roll();
        jogada_1.imprimirJogada();
        System.out.println();

        System.out.println("Jogada 2");
        System.out.println(jogada_2);
        jogada_2.roll();
        jogada_2.imprimirJogada();
        System.out.println();

        System.out.println("Jogada 3");
        System.out.println(jogada_3);
        jogada_3.roll();
        jogada_3.imprimirJogada();
        System.out.println();
    }
}
