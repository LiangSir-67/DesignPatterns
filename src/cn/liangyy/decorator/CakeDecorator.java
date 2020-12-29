package cn.liangyy.decorator;

import java.math.BigDecimal;

/**
 * 抽象装饰器
 */
public abstract class CakeDecorator extends Cake {
    private Cake cake;

    public CakeDecorator(Cake cake){
        this.cake = cake;
    }

    /**
     * 获取蛋糕的基本信息
     *
     * @return
     */
    @Override
    public String getCakeMsg() {
        //调用被装饰的对象原生方法
        return this.cake.getCakeMsg();
    }

    /**
     * 获取蛋糕的价格
     *
     * @return
     */
    @Override
    public BigDecimal getPrice() {
        //调用被装饰的对象原生方法
        return this.cake.getPrice();
    }
}
