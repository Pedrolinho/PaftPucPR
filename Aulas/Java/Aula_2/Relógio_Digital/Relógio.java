package PaftPucPR.Aulas.Java.Aula_2.Relógio_Digital;

public class Relógio {

    int hora;
    int minuto;

    void próximoMinuto(String relógio){
        minuto++;
        if(minuto == 60){
            hora++;
            if(hora >= 24){
                hora = 0;
            }
            minuto = 0;
        }
        imprimir(relógio);
    }

    void imprimir(String relógio){
        System.out.printf("%s: %02d" + ":" + "%02d\n", relógio, hora, minuto);
    }
}
