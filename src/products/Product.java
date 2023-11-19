package products;

public class Product {
    private double price;
    private String name;
    private String description;
    private Integer quantity;

    public Product(double price, String name, String description, Integer quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product: price-%s, name-%s, description-%s, quantity-%s".formatted(price, name, description, quantity);
    }
}
