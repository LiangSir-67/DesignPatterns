package cn.liangyy.proxy.jdkproxy;

/**
 * JDK动态代理模式-测试
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        Travel travel = (Travel) new JdkTravelAgency().getInstance(new JdkTravelPerson());
        travel.buyTrainticket();
    }
}
