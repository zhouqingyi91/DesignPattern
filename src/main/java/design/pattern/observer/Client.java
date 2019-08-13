package design.pattern.observer;

public class Client {
    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(currentCondition);
        // 更新天气情况
        weatherData.setDate(30, 50, 100);
    }
}
