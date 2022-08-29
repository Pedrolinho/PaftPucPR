package PaftPucPR.Aulas.Java.Aula_3.Conta_Corrente;

import java.util.Scanner;

public class Operações {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        // Leitura do Saldo
        System.out.println("Digite seu saldo:");
        int saldo_inicial = Integer.parseInt(in.nextLine());
        ContaCorrente cc = new ContaCorrente(saldo_inicial);

        // Operações
        cc.sacar(100);
        cc.depositar(500);
    }
}
