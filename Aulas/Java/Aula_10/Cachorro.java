package PaftPucPR.Aulas.Java.Aula_10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Cachorro {
    private String nome;
    private double peso;
    private int altura;
    private boolean guarda = false;

    public static List<Cachorro> getCachorros() {
        return Arrays.asList(
                new Cachorro("Chihuahua", 2, 18),
                new Cachorro("Maltês", 3.5, 23),
                new Cachorro("Dobberman", 38.5, 70, true),
                new Cachorro("São Bernardo", 95, 80, false),
                new Cachorro("Rottweiler", 48, 62, true),
                new Cachorro("Pug", 7, 26)
        );
    }

    public Cachorro(String nome, double peso, int altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Cachorro(String nome, double peso, int altura, boolean guarda) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.guarda = guarda;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isGuarda() {
        return guarda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(nome, ((Cachorro) o).nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}