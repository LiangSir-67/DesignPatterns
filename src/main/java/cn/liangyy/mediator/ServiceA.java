package cn.liangyy.mediator;

/**
 * 具体服务 A
 */
public class ServiceA extends AbstractService {
    public ServiceA(AbstractMediator mediator){
        super(mediator);
    }

    @Override
    public void doSomething() {
        //这个方法是服务A自己的业务
        System.out.println("我是 Service A");
    }

    public void callB(){
        //先完成自己的业务
        this.doSomething();
        //紧接着服务A调用B的方法
        System.out.println("调用 Service B");
        //通过中介者调用服务B的方法
        mediator.callServiceB();
    }
}
