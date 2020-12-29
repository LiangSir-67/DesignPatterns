package cn.liangyy.proxy.cglibproxy;

/**
 * 被代理对象类
 */
public class CglibTravelPerson {
    public void buyTrainticket() {
        System.out.println("cglib:西安到成都");
        System.out.println("cglib:早上9:00出发");
    }
}
