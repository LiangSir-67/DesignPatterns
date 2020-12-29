package cn.liangyy.observer.push;

/**
 * 观察者模式-测试
 */
public class TestWeather {
    public static void main(String[] args) {
        //天气数据即被观察者
        WeatherData weatherData = new WeatherData();
        //天气展示即观察者
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherData);
        //被观察者数据发生变化了，其内部会通知观察者
        weatherData.setMessurements(16.2f);
        //查看观察者是否获取到了最新温度数据
        weatherDisplay.display();
    }
}
