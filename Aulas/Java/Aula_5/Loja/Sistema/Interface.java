package PaftPucPR.Aulas.Java.Aula_5.Loja.Sistema;

import PaftPucPR.Aulas.Java.Aula_5.Loja.Login.*;
import java.util.Scanner;

public class Interface {
    Scanner in = new Scanner(System.in);

    void loginUI(Login x){
        String cpf;
        String senha;
        System.out.println("CPF: ");
        cpf = in.next();
        System.out.println("Senha: ");
        senha = in.next();

        
    }
    void menuUI(){

    }
}
