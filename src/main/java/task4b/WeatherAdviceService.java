package task4b;

public class WeatherAdviceService {
    private WeatherService weatherService;

    public WeatherAdviceService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getWeatherAdvice() {
        int temperature = weatherService.getTemperature();
        if (temperature > 30) {
            return "It's hot outside, wear a hat!";
        } else if (temperature < 0) {
            return "It's freezing, wear a coat!";
        } else {
            return "It's a nice day!";
        }
    }
}
