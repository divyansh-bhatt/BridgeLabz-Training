import java.util.*;
class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return name + " | " + price + " | " + rating + " | " + discount;
    }
}

public class DynamicSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 70000, 4.6, 10),
                new Product("Phone", 50000, 4.8, 15),
                new Product("Tablet", 30000, 4.4, 20)
        ));
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));

    }
}
