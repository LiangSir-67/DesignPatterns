package cn.liangyy.mediator;

/**
 * 抽象服务类
 */
public abstract class AbstractService {
    //中介者对象
    protected  AbstractMediator mediator;
    
    public AbstractService(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public abstract void doSomething();
}
