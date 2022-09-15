package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Login;

public class Verificador {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    

    public Verificador(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public boolean verificarNome(){
        if(getNome().matches("^[a-zA-Zà-úÀ-Ú\\s]+$")){
            return true;
        }
        return false;
    }
    public boolean verificarCPF(){
        if(getCpf().matches("[0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2}")){
            return true;
        }
        return false;
    }
}
