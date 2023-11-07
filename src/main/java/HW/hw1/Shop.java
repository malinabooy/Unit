package HW.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sortProductsByPrice() {
        Collections.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }

    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }

        return Collections.max(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }

    public List<Product> getProducts() {
        return products;
    }
}
