package task4b;

public class WeatherServiceStub implements WeatherService {
    private int temperatureToReturn;

    public WeatherServiceStub(int temperature) {
        this.temperatureToReturn = temperature;
    }

    @Override
    public int getTemperature() {
        return temperatureToReturn; // Возвращает заранее заданную температуру
    }
}
