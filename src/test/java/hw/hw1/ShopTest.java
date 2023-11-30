package hw.hw1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ShopTest {
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        shop.addProduct(new Product("Product A", 50.0));
        shop.addProduct(new Product("Product B", 30.0));
        shop.addProduct(new Product("Product C", 70.0));
        shop.sortProductsByPrice();

        List<Product> sortedProducts = shop.getProducts();

        // Проверяем, что продукты отсортированы по цене в порядке возрастания
        assertThat(sortedProducts).containsExactly(
                new Product("Product B", 30.0),
                new Product("Product A", 50.0),
                new Product("Product C", 70.0)
        );
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        shop.addProduct(new Product("Product A", 50.0));
        shop.addProduct(new Product("Product B", 30.0));
        shop.addProduct(new Product("Product C", 70.0));

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверяем, что самый дорогой продукт возвращается правильно
        assertThat(mostExpensiveProduct.getName()).isEqualTo("Product C");
        assertThat(mostExpensiveProduct.getPrice()).isEqualTo(70.0);
    }
}
