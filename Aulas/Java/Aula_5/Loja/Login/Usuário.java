package PaftPucPR.Aulas.Java.Aula_5.Loja.Login;

public class Usuário {
    // Atributos
    private String CPF;
    private String Senha;
    private Boolean userVálido;

    // Construtor
    public Usuário(String cpf, String senha){
        this.CPF = cpf;
        this.Senha = senha;
        this.userVálido = false;
    }

    // Getters
    public String getCPF() {
        return CPF;
    }
    public String getSenha() {
        return Senha;
    }
    public Boolean getVálido() {
        return userVálido;
    }

    // Setters
    public void setCPF(String cpf) {
        CPF = cpf;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public void setVálido(Boolean válido) {
        this.userVálido = válido;
    }

    // Módulos
    public void validarCPF(Usuário x){

    }
    public void validarSenha(Usuário x){

    }
}
