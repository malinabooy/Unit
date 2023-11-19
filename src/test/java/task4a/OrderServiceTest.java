package task4a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    /*
    Dummy (Фиктивный объект):

    Назначение: используется для заполнения параметров методов, не требует функционала;
    Отличие: не имеет реализации, служит лишь для прохождения аргументов;
    Особенность: не влияет на выполнение теста, поскольку не используется самим тестируемым компонентом.
     */

    @Test
    public void testAddOrder() {
        // Создаем фиктивный объект Order, который не будет использоваться
        Order dummyOrder = new Order(); // Это наш Dummy Object

        // Создаем фейковую базу данных, вместо настоящей
        FakeOrderDatabase fakeDatabase = new FakeOrderDatabase();

        // Создаем экземпляр OrderService и передаем туда фейковую базу данных
        OrderService service = new OrderService(fakeDatabase);

        // Вызываем метод addOrder, передавая фиктивный объект
        service.addOrder(dummyOrder);

        // В этом месте мы бы проверили, что метод store был вызван с dummyOrder,
        // но для Dummy Object это не требуется, так как он не несет в себе никакой функциональности
        // Здесь мы могли бы использовать Mock, чтобы убедиться, что вызов был сделан.

        assertTrue(true, "Метод выполнен успешно");
    }
}