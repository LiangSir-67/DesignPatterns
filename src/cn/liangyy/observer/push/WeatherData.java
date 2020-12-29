package cn.liangyy.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据
 */
public class WeatherData implements Subject {
    //观察者不止一个，所以用list进行维护
    private List<Observer> observers;

    //温度
    private float temperature;

    public void setMessurements(float temperature){
        this.temperature = temperature;
        //气温信息发生变化时，通知所有观察者
        notifyObservers();
    }

    public WeatherData(){
        //初始化list
        this.observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers() {
        //遍历所有的观察者
        for (Observer observer : observers){
            //通知观察者更新数据信息
            observer.update(temperature);
        }
    }
}
