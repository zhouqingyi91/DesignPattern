package design.pattern.observer.Improve;

public class Baidu implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("======百度天气======");
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);
    }
}
