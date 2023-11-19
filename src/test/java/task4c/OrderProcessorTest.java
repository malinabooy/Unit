package task4c;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderProcessorTest {
    /*
    Mock (Имитация):

Назначение: заменяет реальный компонент, позволяя проверять взаимодействие между объектами;
Отличие: может проверять, были ли вызваны методы с нужными аргументами;
Особенность: используется для проверки поведения, важны последовательность и параметры вызовов.
     */
    private DeliveryService deliveryServiceMock;
    private OrderProcessor orderProcessor;
    private Order order;

    @Before
    public void setUp() {
// Создаем Mock объект для DeliveryService
        deliveryServiceMock = mock(DeliveryService.class);
        orderProcessor = new OrderProcessor(deliveryServiceMock);
        order = new Order(); // Здесь мы могли бы настроить заказ, если бы это было необходимо
    }

    @Test
    public void testProcessOrder_SchedulesDelivery() {
// Выполняем метод, который хотим протестировать
        orderProcessor.processOrder(order);

// Проверяем, что метод scheduleDelivery был вызван с правильным заказом
        verify(deliveryServiceMock).scheduleDelivery(order);
    }
}