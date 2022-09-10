package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja;


public class Sistema {
    public static void main(String[] args) {
        Login users = new Login();
        users.adicionarUsuário();
        users.adicionarUsuário();
        users.adicionarUsuário();
        users.excluirUsuário("admin");
    }
}