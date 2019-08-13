package design.pattern.observer;

/**
 * 核心类
 * 1) 包含最新的天气情况信息
 * 2) 含有CurrentCondition对象(第三方) --- 可以把CurrentCondition当成是展示天气情况的网站
 * 3) 当天气数据更新时, 主动调用CurrentCondition的update方法, 这样就能实时更新数据
 */
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    // 第三方
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    /**
     * 当数据更新时调用这个方法
     * 会调用dataChange()然后去更新第三方的数据
      */
    public void setDate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }

    public void dataChange() {
        currentCondition.update(temperature, humidity, pressure);
    }
}
