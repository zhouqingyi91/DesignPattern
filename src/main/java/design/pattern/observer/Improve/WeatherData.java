package design.pattern.observer.Improve;

import design.pattern.observer.CurrentCondition;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 1) 包含最新的天气情况信息
 * 2) 含有第三方的ArrayList --- 可以把CurrentCondition当成是展示天气情况的网站
 * 3) 当天气数据更新时, 主动推送给所有的第三方, 这样就能实时更新数据
 */
public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;

    // 第三方
    private ArrayList<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    /**
     * 当数据更新时调用这个方法
     * 会调用dataChange()然后去更新第三方的数据
      */
    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }

    /**
     * 一有数据更新就通知所有的第三方
     */
    public void dataChange() {
        notifyObserver();
    }

    /**
     * 添加第三方
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除第三方
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer))
            observerList.remove(observer);
    }

    /**
     * 通知第三方
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
