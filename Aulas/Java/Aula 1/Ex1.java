import java.util.Scanner;

public class Ex1{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Digite uma quantidade de números:");
        int numero = Integer.parseInt(in.nextLine());
        int menor = 1000000000;
        int maior = 0;
        int [] valores = new int [numero];

        for(int x=0; x < numero; x = x + 1){
            valores[x] = Integer.parseInt(in.nextLine());
            if(valores[x] > maior){
                maior = valores[x];
            }
            if(valores[x] < menor){
                menor = valores[x];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor " + menor);
    }
}