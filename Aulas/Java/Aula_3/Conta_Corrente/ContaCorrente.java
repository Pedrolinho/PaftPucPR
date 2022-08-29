package PaftPucPR.Aulas.Java.Aula_3.Conta_Corrente;

public class ContaCorrente {
    private double saldo;

    // Construtores
    public ContaCorrente(Integer saldo){
        this.saldo = saldo;
    }
    public ContaCorrente(){
        this.saldo = 0;
    }

    //Métodos
    public void sacar(double quantia){
        boolean sinal = false;
        double saldo_old;

        if(quantia <= saldo && quantia > 0){
            saldo_old = saldo;
            saldo -= quantia;
            ContaCorrente.imprimirOperação(sinal, saldo, saldo_old, quantia);
        }
        else{
            if(quantia <= 0){
                throw new IllegalArgumentException("Não é possível sacar nenhuma quantia.");
            }
            else if(quantia > saldo){
                throw new IllegalArgumentException("Não há saldo o suficiente para saque.");
            }
        }
    }
    public void depositar(double quantia){
        boolean sinal = true;
        double saldo_old;

        if(quantia > 0){
            saldo_old = saldo;
            saldo += quantia;
            ContaCorrente.imprimirOperação(sinal, saldo, saldo_old, quantia);
        }
        else{
            if(quantia == 0){
                throw new IllegalArgumentException("Não é possível depositar nenhuma quantia.");
            }
        }
    }
    private static void imprimirOperação(boolean sinal, double saldo, double saldo_old, double quantia){
        if(sinal == true){
            System.out.printf("%.2f + %.2f = %.2f\n", saldo_old, quantia, saldo);
        }
        else if(sinal == false){
            System.out.printf("%.2f - %.2f = %.2f\n", saldo_old, quantia, saldo);
        }
    }
}