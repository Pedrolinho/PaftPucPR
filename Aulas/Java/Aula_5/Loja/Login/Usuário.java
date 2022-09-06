package PaftPucPR.Aulas.Java.Aula_5.Loja.Login;

import java.util.Scanner;

import PaftPucPR.Aulas.Java.Aula_5.Loja.Sistema.Sistema;

public class Usuário {
    public static Scanner in = new Scanner(System.in);
    Login login = new Login();

    // Atributos
    private String CPF;
    private String Senha;

    // Construtor
    public Usuário(String cpf, String senha){
        this.CPF = cpf;
        this.Senha = senha;
    }

    // Getters
    public String getCPF() {
        return CPF;
    }
    public String getSenha() {
        return Senha;
    }

    // Setters
    public void setCPF(String cpf) {
        CPF = cpf;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }

    // Módulos
    void criarUsuário(){
        System.out.println("Digite o CPF:");
        String cpf = in.nextLine();
        System.out.println("Digite a senha:");
        String senha = in.nextLine();
        login.adicionarUsuário();
    }

    public static boolean validarUsuário(String cpf, String usuário){
        boolean validação = false;getUsers()){
            if(getCPF() == cpf){
                validação = true;
                return validação;
            }
        }
        return validação;
    }
}
