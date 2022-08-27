import java.util.Scanner;

public class Ex3{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite um número:");
        int numero = Integer.parseInt(in.nextLine());
        System.out.println("Sequência de Collatz:");
        System.out.println(numero);

        if(numero == 2){
            numero = numero/2;
            System.out.println(numero);
        }
        if(numero == 1){
            numero = (numero*3) + 1;
            System.out.println(numero);
        }

        while(numero != 1){
            if(numero % 2 == 1){
                numero = (3*numero) + 1;
            }
            else{
                numero = numero/2;
            }
            System.out.println(numero);
        }
    }
}