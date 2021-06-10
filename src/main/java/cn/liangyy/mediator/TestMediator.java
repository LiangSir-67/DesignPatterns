package cn.liangyy.mediator;

/**
 * 中介者模式-测试
 */
public class TestMediator {
    public static void main(String[] args) {
        //构建一个中介者对象
        AbstractMediator registerCenter = new RegisterCenter();
        //将每个对象初始化进中介者对象
        ServiceA serviceA = new ServiceA(registerCenter);
        ServiceB serviceB = new ServiceB(registerCenter);

        registerCenter.setServiceA(serviceA);
        registerCenter.setServiceB(serviceB);

        //服务A调用服务B，实际上A内部是通过中介者调用的，B和A本身没有依赖
        serviceA.callB();
        System.out.println("**********************");
        serviceB.callA();
    }
}
