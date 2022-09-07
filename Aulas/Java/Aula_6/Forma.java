package PaftPucPR.Aulas.Java.Aula_6;

public abstract class Forma {
    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double getÁrea();
    public abstract double getPerímetro();

    @Override
    public String toString() {
        return String.format("Área: %.2f - Perímetro: %.2f", getÁrea(), getPerímetro());
    }
}
