import java.util.Scanner;

public class Ex2{
    static Scanner in = new Scanner(System.in);

    static String localizarExtremos(int[] valores, int numero){
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for(int x=0; x < numero; x = x + 1){
            if(valores[x] > maior){
                maior = valores[x];
            }
            if(valores[x] < menor){
                menor = valores[x];
            }
        }
        String texto = "O número menor é " + menor + " e o maior é " + maior + ".";

        return texto;
    }

    public static void main(String[] args){
        System.out.println("Digite uma quantidade de números:");
        int numero = Integer.parseInt(in.nextLine());
        int [] valores = new int [numero];

        for(int x=0; x < numero; x = x + 1){
            System.out.println("- Número " + (x+1));
            valores[x] = Integer.parseInt(in.nextLine());
        }

        String texto = localizarExtremos(valores, numero);
        System.out.println(texto);
    }
}