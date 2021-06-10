package cn.liangyy.observer.push;

/**
 * 观察者类
 */
public class WeatherDisplay implements Observer {
    //维护观察者
    private Subject subject;
    //温度
    private float temperature;

    public WeatherDisplay(Subject subject){
        //注册监听对象
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature) {
        //当被观察者气温发生变化会调用这个方法，也就等于更新了观察者对象的数据
        this.temperature = temperature;
    }

    public void display(){
        System.out.println("当前最新的温度是："+temperature);
    }
}
