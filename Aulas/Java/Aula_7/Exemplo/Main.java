package PaftPucPR.Aulas.Java.Aula_7.Exemplo;

import java.util.*;

class FiltroMenores30 implements CritérioFiltragem {
    @Override
    public boolean devoFiltrar(Aluno aluno) {
        return aluno.getIdade() < 30;
    }
}
public class Main {
    public static List<Aluno> filtrar(List<Aluno> alunos, CritérioFiltragem x) {
        List<Aluno> resultado = new ArrayList<>();
        for(Aluno aluno: alunos) {
            if(x.devoFiltrar(aluno)) {
                resultado.add(aluno);
            }
        }
        return resultado;
    } 

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Vinicius", 21));
        alunos.add(new Aluno("Adriana", 25));
        alunos.add(new Aluno("Lucas", 30));
        alunos.add(new Aluno("Mariana", 21));

        for(Aluno aluno : alunos) {

        }

        // Classe anônima
        for(Aluno aluno: filtrar(alunos, new CritérioFiltragem()) {
            @Override
            public boolean devoFiltrar(Aluno aluno) {
                return aluno.getNome().toUpperCase().startsWith("A");
            }
        }
    }
    
}
