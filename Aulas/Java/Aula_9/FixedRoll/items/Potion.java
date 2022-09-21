package PaftPucPR.Aulas.Java.Aula_9.FixedRoll.items;

public class Potion {
    // Atributos
    private int life_points;
    private int quantity;


    // Construtor
    public Potion(int quantity){
        this.quantity = quantity;
        this.life_points = 10;
    }

    // Getters
    public int getLife_points() {
        return life_points;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setLife_points(int life_points) {
        this.life_points = life_points;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
