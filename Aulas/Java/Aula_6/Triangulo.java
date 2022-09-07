package PaftPucPR.Aulas.Java.Aula_6;

public class Triangulo extends Forma {
    double base;
    double altura;

    public Triangulo(double base, double altura){
        super("Azul");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double getÁrea() {
        return 0;
    }
    @Override
    public double getPerímetro() {
        return 0;
    }
}
