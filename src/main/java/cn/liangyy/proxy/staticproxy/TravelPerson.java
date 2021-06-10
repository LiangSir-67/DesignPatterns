package cn.liangyy.proxy.staticproxy;

/**
 * 被代理对象
 */
public class TravelPerson implements Travel {
    /**
     * 买火车票
     */
    @Override
    public void buyTrainticket() {
        System.out.println("西安到成都");
        System.out.println("早上10:00出发");
    }
}
