package PaftPucPR.Aulas.Java.Aula_6;

public class Círculo extends Forma{
    private double raio;
    

    public Círculo(double raio, String cor){
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    @Override
    public double getÁrea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerímetro() {
        return 2 * Math.PI * raio;
    }
}
