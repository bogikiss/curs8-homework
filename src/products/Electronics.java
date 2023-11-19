package products;

public class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, Integer quantity, String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
