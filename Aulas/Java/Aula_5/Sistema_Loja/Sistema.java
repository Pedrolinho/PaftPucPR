package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja;

import java.util.*;

import PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Login.Login;

public class Sistema {
    public static Scanner in = new Scanner(System.in);
    public static void LoginUI(Login user){
        String CPF;
        String Senha;

        System.out.println("===================================\n" +
                           "               LOGIN               \n" +
                           "===================================");
        System.out.println("CPF:");
        CPF = in.next();
        while(user.verificarUsuário(CPF) == false){
            System.out.println("Usuário não cadastrado!\n1. Digitar novamente\n2. Cadastrar usuário");
            
            int loginChoice = in.nextInt();
            while(loginChoice != 1 && loginChoice != 2){
                System.out.println("Opção inválida!");
                loginChoice = in.nextInt();
            }
            if(loginChoice == 1){
                LoginUI(user);
                return;
            }
            if(loginChoice == 2){
                user.adicionarUsuário();
                LoginUI(user);
                return;
            }
        }
        System.out.println("Senha:");
        Senha = in.next();
        while(user.verificarSenha(CPF, Senha) == false){
            System.out.println("Senha inválida!");
            Senha = in.next();
        }
    }

    public static void menuPrincipalUI(Login user){

        System.out.println("===================================\n" +
                           "           MENU PRINCIPAL          \n" +
                           "===================================");
        System.out.println("1. Fazer Compras\n2. (ADMIN) Relatório sobre clientes\n3. Trocar Usuário\n4. Sobre\n5. Sair");
        int menuChoice = in.nextInt();
        while(menuChoice != 1 && menuChoice !=2 && menuChoice !=  3 && menuChoice !=  4 && menuChoice !=  5){
            System.out.println("Opção inválida!");
            menuChoice = in.nextInt();
        }
        if(menuChoice == 1){

        }
        if(menuChoice == 2){
            if(user.getCPF() == "admin"){
                System.out.println("Acessado");
            }
            else{
                System.out.println("Somente o usuário administrador pode acessar essa opção.");
                menuPrincipalUI(user);
            }
        }
        if(menuChoice == 3){
            
        }
        if(menuChoice == 4){
            System.out.println("Sistema: Dunder Mifflin - Loja Virtual\n" +
                               "Versão: 1.0\n" +
                               "Desenvolvedor: Pedro André Lourenço Caetano da Cunha");
            menuPrincipalUI(user);
        }
        if(menuChoice == 5){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        Login users = new Login();
        LoginUI(users);
        menuPrincipalUI(users);
    }
}