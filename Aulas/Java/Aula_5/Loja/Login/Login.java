package PaftPucPR.Aulas.Java.Aula_5.Loja.Login;

import java.util.*;

public class Login {
    // Atributos
    private static List<Usuário> users = new ArrayList<>();

    // Getters
    public static List<Usuário> getUsers() {
        return users;
    }

    // Métodos
    public void criarUsuário(String cpf, String senha){
        Usuário x = new Usuário(cpf, senha);
        users.add(x); 
    }

    public void validarUsuário(Usuário x){
        Boolean cpf = false;
        Boolean senha = false;
        
        for(Usuário y: users){
            if(y.getCPF() == x.getCPF()){
                cpf = true;
            }
            if(y.getSenha() == x.getSenha()){
                senha = true;
            }
        }

        if(cpf == true && senha == true){
            x.setVálido(true);
        }
    }
}
