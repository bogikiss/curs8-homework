package products;

public class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String description, Integer quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
