package PaftPucPR.Aulas.Java.Aula_2.Ex1;
import java.util.Scanner;


public class Retângulos {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        Retângulo[] retangulos = new Retângulo[5];

        for(int x = 0; x < retangulos.length; x++){
            Retângulo objeto = new Retângulo();
            System.out.println("Retângulo " + (x+1));

            System.out.println("Altura:");
            objeto.altura = Integer.parseInt(in.nextLine());
            System.out.println("Largura:");
            objeto.largura = Integer.parseInt(in.nextLine());

            retangulos[x] = objeto;
        }

        for(Retângulo ret: retangulos){
            System.out.printf("Retângulo: altura %.2f largura %.2f área: %.2f perímetro: %.2f\n", ret.altura, ret.largura, ret.área(), ret.perímetro());
        }
    }
}
