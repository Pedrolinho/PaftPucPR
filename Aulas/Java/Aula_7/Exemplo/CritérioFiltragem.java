package PaftPucPR.Aulas.Java.Aula_7.Exemplo;

public interface CritérioFiltragem {

    /*
     * O método devoFiltrar deve retornar verdadeiro para qualquer Aluno que
     * deve ser adicionado na lista aós a filtragem.
     * @param aluno O aluno a ser testado
     * @return Verdadeiro se deve ser incluído/ Falso se não.
     */

    boolean devoFiltrar(Aluno aluno);
}
