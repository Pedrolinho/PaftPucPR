package PaftPucPR.Aulas.Java.Aula_3.Semáforo;

import java.util.Scanner;

public class Controle {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////
        /// Semáforo 1 - construtor recebendo a cor como argumento ///
        //////////////////////////////////////////////////////////////
        System.out.println("Digite a cor inicial:\n0.Verde\n1.Amarelo\n2.Vermelho");
        int cor_inicial = Integer.parseInt(in.nextLine());
        while(cor_inicial != 0 && cor_inicial != 1 && cor_inicial != 2){
            System.out.println("Cor inválida! Digite a opção 0, 1 ou 2.");
            cor_inicial = Integer.parseInt(in.nextLine());
        }
        Semáforo semaforo_1 = new Semáforo(cor_inicial);

        // Prints da cor atual dinamicamente 
        System.out.println();
        System.out.println("Semáforo 1");
        System.out.println(semaforo_1.getColorText());

        for(int x = 0; x < 10; x++){
            semaforo_1.PróximaCor();
            System.out.println(semaforo_1.getColorText());
        }

        semaforo_1.setCor(1);
        System.out.println(semaforo_1.getColorText());


        System.out.println();


        /////////////////////////////////////
        /// Semáforo 2 - construtor vazio ///
        /////////////////////////////////////
        Semáforo semaforo_2 = new Semáforo();

        // Prints da cor atual dinamicamente 
        System.out.println("Semáforo 2");
        System.out.println(semaforo_2.getColorText());

        for(int x = 0; x < 10; x++){
            semaforo_2.PróximaCor();
            System.out.println(semaforo_2.getColorText());
        }

        semaforo_2.setCor(5);
        System.out.println(semaforo_2.getColorText());
    }
}
