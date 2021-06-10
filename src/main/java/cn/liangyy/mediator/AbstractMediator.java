package cn.liangyy.mediator;

/**
 * 抽象中介者类
 */
public abstract class AbstractMediator {
    //持有服务A
    protected AbstractService serviceA;
    //持有服务B
    protected AbstractService serviceB;

    public void setServiceA(AbstractService serviceA){
        this.serviceA = serviceA;
    }

    public void setServiceB(AbstractService serviceB){
        this.serviceB = serviceB;
    }

    /**
     * 下面这两个方法也一样，一般每个微服务都需要对应一个方法
     */
    //调用服务 A 方法
    public abstract void callServiceA();
    //调用服务 B 方法
    public abstract void callServiceB();
}
