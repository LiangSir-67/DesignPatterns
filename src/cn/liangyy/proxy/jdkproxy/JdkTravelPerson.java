package cn.liangyy.proxy.jdkproxy;

/**
 * 被代理类
 */
public class JdkTravelPerson implements Travel {
    /**
     * 买火车票
     */
    @Override
    public void buyTrainticket() {
        System.out.println("西安到成都");
        System.out.println("早上10:00出发");
    }
}
