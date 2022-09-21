package PaftPucPR.Aulas.Java.Aula_10;

public class Planeta {
    private String nome;
    private int diametro;

    private double massa;

    private int satelites;

    public static Planeta[] sistemaSolar() {
        return new Planeta[] {
                new Planeta("Mercúrio", 4_878, 0.6, 0),
                new Planeta("Vênus", 12_103, 0.81, 0),
                new Planeta("Terra", 12_756, 1, 1),
                new Planeta("Marte", 6_786, 0.11, 2),
                new Planeta("Júpiter", 142_984, 317.94, 63),
                new Planeta("Saturno", 120_536, 95.18, 62),
                new Planeta("Urano", 51_118, 14.54, 27),
                new Planeta("Netuno", 49_528	, 17.14, 14)
        };
    }

    public Planeta(String nome, int diametro, double massa, int satelites) {
        this.nome = nome;
        this.diametro = diametro;
        this.massa = massa;
        this.satelites = satelites;
    }

    public String getNome() {
        return nome;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRaio() { return diametro / 2.0f; }

    public double getMassa() {
        return massa;
    }

    public int getSatelites() {
        return satelites;
    }

    @Override
    public String toString() {
        return nome;
    }
}
