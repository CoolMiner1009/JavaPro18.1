import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Book", 200),
                new Product("Book", 300),
                new Product("Book", 400),
                new Product("Toy", 100)
        );

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .collect(Collectors.toList());

        filteredProducts.forEach(p -> System.out.println("Type: " + p.getType() + ", Price: " + p.getPrice()));
    }
}

