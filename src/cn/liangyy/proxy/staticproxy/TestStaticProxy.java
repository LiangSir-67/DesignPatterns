package cn.liangyy.proxy.staticproxy;

/**
 * 静态代理模式-测试
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(new TravelPerson());
        travelAgency.buyTrainticket();
    }
}
