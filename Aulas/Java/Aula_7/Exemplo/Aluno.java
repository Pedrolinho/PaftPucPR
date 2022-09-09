package PaftPucPR.Aulas.Java.Aula_7.Exemplo;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;    
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Aluno o) {
        /*
            if(idade < o.idade) {
                return -1;
            }
            if(idade > o.idade) {
                return 1;
            }
            return nome.compareTo(o.nome);
         */
        
        return o.idade - idade;
    }
}
