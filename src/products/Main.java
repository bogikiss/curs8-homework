package products;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(15.4, "dress", "red dress for women", 20);
        Cosmetics cosmetics1 = new Cosmetics(9.9, "hydrating face cream", "with hyaluronic acid", 41, "white", 100);
        Electronics electronics1 = new Electronics(1000, "laptop", "new model Lenovo laptop", 13, "portable electronics", 35, 20, 2, 1.9);
        Fridge fridge1 = new Fridge(1500, "Samsung CR573X fridge freezer", "Samsung series 6 classic fridge freezer", 22, "home appliances", 59, 60, 185, 66, 0);

        System.out.println(product1.getPrice());
        System.out.println(product1.getDescription());
        System.out.println(cosmetics1.getDescription());
        System.out.println(electronics1.getWeight());
        System.out.println(fridge1.getType());

        System.out.println("The " + fridge1.getName() + " weigths " + fridge1.getWeight() + " kgs.");

        System.out.println(product1);
    }
}
