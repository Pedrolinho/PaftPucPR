package PaftPucPR.Aulas.Java.Aula_9.FixedRoll.system;

public class FixedRoll implements Rollable{
    int[]values;
    int i;
    public FixedRoll(int... values) {
        this.values = values;
    }

    @Override
    public int roll() {
        i += 1;
        if(i>=values.length) i=0;
        return values[i];
    }
}