package cn.liangyy.decorator;

import java.math.BigDecimal;

/**
 * 葡萄装饰器类
 */
public class CakeAddGrapeDecorator extends CakeDecorator {
    public CakeAddGrapeDecorator(Cake cake) {
        super(cake);
    }

    /**
     * 获取蛋糕的基本信息
     *
     * @return
     */
    @Override
    public String getCakeMsg() {
        //调用父类装饰器方法，再加上自定义的装饰
        return super.getCakeMsg()+"1个葡萄";
    }

    /**
     * 获取蛋糕的价格
     *
     * @return
     */
    @Override
    public BigDecimal getPrice() {
        //调用父类装饰器方法，再加上自定义的装饰
        return super.getPrice().add(new BigDecimal("5"));
    }
}
