package PaftPucPR.Aulas.Java.Aula_2.Relógio_Digital;

import java.util.Scanner;

public class Relógios {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        String rel_1 = "Relógio 1";
        String rel_2 = "Relógio 2";


        Relógio clock_1 = new Relógio();
        System.out.println(rel_1);
        System.out.println("Hora: ");
        clock_1.hora = Integer.parseInt(in.nextLine());
        if(clock_1.hora < 0 || clock_1.hora > 23){
            while(clock_1.hora < 0 || clock_1.hora > 23){
                System.out.println("Entrada inválida! Digite um número entre 0 e 23.");
                clock_1.hora = Integer.parseInt(in.nextLine());
            }
        }
        System.out.println("Minuto: ");
        clock_1.minuto = Integer.parseInt(in.nextLine());
        if(clock_1.minuto < 0 || clock_1.minuto > 60){
            while(clock_1.minuto < 0 || clock_1.minuto > 60){
                System.out.println("Entrada inválida! Digite um número entre 0 e 60.");
                clock_1.minuto = Integer.parseInt(in.nextLine());
            }
        }

        Relógio clock_2 = new Relógio();
        System.out.println(rel_2);
        System.out.println("Hora: ");
        clock_2.hora = Integer.parseInt(in.nextLine());
        if(clock_2.hora < 0 || clock_2.hora > 23){
            while(clock_2.hora < 0 || clock_2.hora > 23){
                System.out.println("Entrada inválida! Digite um número entre 0 e 23.");
                clock_2.hora = Integer.parseInt(in.nextLine());
            }
        }
        System.out.println("Minuto: ");
        clock_2.minuto = Integer.parseInt(in.nextLine());  
        if(clock_2.minuto < 0 || clock_2.minuto > 60){
            while(clock_2.minuto < 0 || clock_2.minuto > 60){
                System.out.println("Entrada inválida! Digite um número entre 0 e 60.");
                clock_2.minuto = Integer.parseInt(in.nextLine());
            }
        }  
        

        clock_1.imprimir(rel_1);
        for(int x=0; x<10; x++){
            clock_1.próximoMinuto(rel_1);
        }

        System.out.println();

        clock_2.imprimir(rel_2);
        for(int x=0; x<10; x++){
            clock_2.próximoMinuto(rel_2);
        }
    }
}