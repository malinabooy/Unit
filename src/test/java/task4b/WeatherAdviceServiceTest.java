package task4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherAdviceServiceTest {
    /*
    Stub (Заглушка):

Назначение: подменяет реальный компонент, возвращая предопределенные значения;
Отличие: имеет заранее заданные ответы, не содержит логики;
Особенность: позволяет тестировать поведение системы при известном ответе от зависимостей.
     */
    @Test
    public void testGetWeatherAdvice_Hot() {
        // Создаем Stub с заранее определенным поведением
        WeatherService hotWeatherStub = new WeatherServiceStub(35);

        // Инициализируем сервис с нашим Stub
        WeatherAdviceService adviceService = new WeatherAdviceService(hotWeatherStub);

        // Получаем совет в зависимости от погоды
        String advice = adviceService.getWeatherAdvice();

        // Проверяем, что совет соответствует горячей погоде
        assertEquals("It's hot outside, wear a hat!", advice);
    }

    @Test
    public void testGetWeatherAdvice_Cold() {
        // Создаем Stub для холодной погоды
        WeatherService coldWeatherStub = new WeatherServiceStub(-5);

        WeatherAdviceService adviceService = new WeatherAdviceService(coldWeatherStub);

        String advice = adviceService.getWeatherAdvice();

        assertEquals("It's freezing, wear a coat!", advice);
    }

    @Test
    public void testGetWeatherAdvice_Pleasant() {
        // Создаем Stub для приятной погоды
        WeatherService pleasantWeatherStub = new WeatherServiceStub(20);

        WeatherAdviceService adviceService = new WeatherAdviceService(pleasantWeatherStub);

        String advice = adviceService.getWeatherAdvice();

        assertEquals("It's a nice day!", advice);
    }
}