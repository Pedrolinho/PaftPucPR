package PaftPucPR.Aulas.Java.Aula_4.Arquivos;

public class Arquivo {
    // Atributos
    String nome;
    String extensão;
    int tamanho;

    // Construtor
    public Arquivo(String nome, String extensão, int tamanho){
        this.nome = nome;
        this.extensão = extensão;
        this.tamanho = tamanho;
    }


    // Getters
    public String getNome() {
        return nome;
    }
    public String getExtensão() {
        return extensão;
    }
    public int getTamanho() {
        return tamanho;
    }


    // To String
    public String toString() {
        return "Arquivo: " + nome + "." + extensão + " |  Tamanho: " + tamanho + "B";
    }
}