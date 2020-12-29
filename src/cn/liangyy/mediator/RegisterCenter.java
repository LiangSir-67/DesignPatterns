package cn.liangyy.mediator;

/**
 * 中介者对象注册中心类
 */
public class RegisterCenter extends AbstractMediator {
    /**
     * 下面这两个方法也一样，一般每个微服务都需要对应一个方法
     */
    @Override
    public void callServiceA() {
        super.serviceA.doSomething();
    }

    @Override
    public void callServiceB() {
        super.serviceB.doSomething();
    }
}
