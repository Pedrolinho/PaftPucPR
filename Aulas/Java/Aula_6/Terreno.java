package PaftPucPR.Aulas.Java.Aula_6;

import java.util.*;

public class Terreno {
    private List<Forma> formas = new ArrayList<>();

    public Terreno() {

    }

    public void add(Forma forma) {formas.add(forma);}

    public double getÁreaTotal() {
        double area = 0;
        for(Forma forma : formas) {area += forma.getÁrea();}
        return area;
    }
}
