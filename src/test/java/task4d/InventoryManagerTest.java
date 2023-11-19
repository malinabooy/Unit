package task4d;

import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.Before;

public class InventoryManagerTest {
    /*
    Spy (Шпион):

Назначение: подобно Stub, но с возможностью записи истории вызовов;
Отличие: может как возвращать заранее определенные ответы, так и отслеживать вызовы;
Особенность: полезен для анализа использования объекта в течение теста.
     */
    private InventoryManager inventoryManagerSpy;
    private Product product;

    @Before
    public void setUp() {
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManagerSpy = spy(inventoryManager);
        product = new Product(); // Здесь мы могли бы настроить продукт, если бы это было необходимо
    }

    @Test
    public void testAddProduct_CallsUpdateInventory() {
        int quantity = 5;

// Вызываем метод, который хотим протестировать
        inventoryManagerSpy.addProduct(product, quantity);

// Проверяем, что метод updateInventory был вызван с правильными параметрами
        verify(inventoryManagerSpy).updateInventory(product, quantity);
    }
}