package cn.liangyy.facade;

/**
 * 门面类
 * 集成两个子系统，并对外开放统一接口
 */
public class Facade {
    private SubSystemA systemA = new SubSystemA();
    private SubSystemB systemB = new SubSystemB();

    public void doA(){
        this.systemA.doSomething();
    }

    public void doB(){
        this.systemB.doSomething();
    }

    public void doAB(){
        this.systemA.doSomething();
        this.systemB.doSomething();
    }
}
