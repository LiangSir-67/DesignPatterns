package cn.liangyy.facade;

/**
 * 门面模式-测试
 */
public class TestSimpleFacade {
    public static void main(String[] args) {
        SimpleFacade simpleFacade = new SimpleFacade();
        simpleFacade.doA();
        simpleFacade.doB();
    }
}
