package cn.liangyy.proxy.staticproxy;

/**
 * 代理类
 */
public class TravelAgency implements Travel {
    private TravelPerson travelPerson; //被代理对象

    public TravelAgency(TravelPerson travelPerson) {
        this.travelPerson = travelPerson;
    }

    /**
     * 买火车票
     */
    @Override
    public void buyTrainticket() {
        before();
        //调用被代理对象的原方法
        this.travelPerson.buyTrainticket();
        after();
    }

    private void before(){
        System.out.println("付定金");
    }

    private void after(){
        System.out.println("付尾款");
    }
}
