package PaftPucPR.Aulas.Java.Aula_5.Loja.Sistema;

import PaftPucPR.Aulas.Java.Aula_5.Loja.Login.*;

public class Sistema {
    public static void main(String[] args) {
        Interface loja = new Interface();

        Login login = new Login();
        login.criarUsuário("admin", "admin");

        loja.loginUI(login);
    }
}
