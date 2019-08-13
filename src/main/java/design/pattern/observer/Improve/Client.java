package design.pattern.observer.Improve;

public class Client {
    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(currentCondition);

        // 气象局更新数据 ---> 推送给所有第三方 ---> 第三方实时更新数据并打印
        weatherData.setData(30, 40, 100);

        System.out.println("======================");

        Baidu baidu = new Baidu();
        weatherData.addObserver(baidu);
        // 气象局更新数据 ---> 推送给所有第三方 ---> 第三方实时更新数据并打印
        weatherData.setData(37, 50, 98);
    }
}
