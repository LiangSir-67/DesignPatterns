package cn.liangyy.abstractFactory;

/**
 * 抽象工厂接口
 */
public interface IFactory {
    IApple createApple();
    IOrange createOrange();
}
