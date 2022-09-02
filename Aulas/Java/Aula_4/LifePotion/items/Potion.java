package PaftPucPR.Aulas.Java.Aula_4.LifePotion.items;

public class Potion {
    private static int life_points = 10;

    public static int getLife_points() {
        return life_points;
    }
    public static void setLife_points(int life_points) {
        Potion.life_points = life_points;
    }
}
