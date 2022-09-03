package PaftPucPR.Aulas.Java.Aula_5.Loja.Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import PaftPucPR.Aulas.Java.Aula_5.Loja.Login.Usuário;

public class Sistema {
    public static Scanner in = new Scanner(System.in);

    private static List<Usuário> users = new ArrayList<>();

    public static List<Usuário> getUsers() {
        return users;
    }
    public static void main(String[] args) {
    adicionarUsuário(Usuário.Administrador);
    if(login() == true){
        System.out.println("Validado");
    }
    }
    public static Boolean login(){
        Boolean validação = false;
        String cpf;
        String senha;

        System.out.println("CPF:");
        cpf = in.nextLine();
        System.out.println("Senha:");
        senha = in.nextLine();

        validação = Usuário.validarUsuário(cpf, senha);

        return validação;
    }
    public static void adicionarUsuário(Usuário x){
        users.add(x);
    }
}
