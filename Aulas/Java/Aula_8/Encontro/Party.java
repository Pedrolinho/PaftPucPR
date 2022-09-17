package PaftPucPR.Aulas.Java.Aula_8.Encontro;

import java.util.ArrayList;
import java.util.List;
import PaftPucPR.Aulas.Java.Aula_8.Encontro.system.*;

public class Party {
    private List<Char> personagens = new ArrayList<>();

    public List<Char> getPersonagens() {
        return personagens;
    }

    public void add(Char e){
        personagens.add(e);
    }

    public void remove(Char e){
        
    }
}
