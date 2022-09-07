package PaftPucPR.Aulas.Java.Aula_6;

public class Retângulo extends Forma {
    private double lado1;
    private double lado2;

    public Retângulo(double lado1, double lado2, String cor){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getÁrea() {
        return lado1 * lado2;
    }
    public double getPerímetro() {
        return (lado1 + lado2) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null) return false;
        if(obj.getClass() != getClass()) return false;
        Retângulo other = (Retângulo) obj;
        return lado1 == other.lado1 && lado2 == other.lado2 && getCor() == other.getCor();
    }

    @Override
    protected Object clone() {
        return new Retângulo(lado1, lado2, getCor());
    }
    
    @Override
    public int hashCode() {
        return (int)(lado1 * 10000 + lado2);
    }
}