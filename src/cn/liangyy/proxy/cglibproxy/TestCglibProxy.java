package cn.liangyy.proxy.cglibproxy;

/**
 * cglib动态代理模式-测试
 */
public class TestCglibProxy {
    public static void main(String[] args){
        CglibTravelPerson cglibTravelPerson = (CglibTravelPerson) new CglibTravelAgency().getInstance(CglibTravelPerson.class);
        cglibTravelPerson.buyTrainticket();
    }
}
