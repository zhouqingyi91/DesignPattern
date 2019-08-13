package design.pattern.observer.Improve;


/**
 * 气象局
 * 有登记, 移除 和 通知的功能
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
