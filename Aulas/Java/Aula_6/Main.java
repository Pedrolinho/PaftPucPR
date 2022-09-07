package PaftPucPR.Aulas.Java.Aula_6;

public class Main {
    public static void main(String[] args) {
        Forma f = new Círculo(10, "Amarelo");
        System.out.println(f);

        f = new Círculo(10, "Amarelo");
        System.out.println(f);

        f = new Retângulo(59, 4, "Amarelo");
        System.out.println(f);

        Retângulo r = new Retângulo(59, 4, "Amarelo");
        System.out.println(f == r);
        System.out.println(f.equals(r));

        Terreno t1 = new Terreno();
        t1.add(new Círculo(20, "Azul"));
        t1.add(new Retângulo(10, 5, "Amarelo"));
        System.out.printf("A área do terreno é %.2f metros quadrados.\n", t1.getÁreaTotal());
    }
}
