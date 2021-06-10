package cn.liangyy.mediator;

/**
 * 具体服务 B
 */
public class ServiceB extends AbstractService {
    public ServiceB(AbstractMediator mediator){
        super(mediator);
    }

    @Override
    public void doSomething() {
        //这个方法是服务B自己的业务
        System.out.println("我是 Service B");
    }

    public void callA(){
        //先完成自己的业务
        this.doSomething();
        //紧接着服务B调用B的方法
        System.out.println("调用 Service A");
        //通过中介者调用服务A的方法
        mediator.callServiceA();
    }
}
