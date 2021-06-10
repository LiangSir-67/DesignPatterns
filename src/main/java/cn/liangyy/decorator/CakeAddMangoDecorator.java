package cn.liangyy.decorator;

import java.math.BigDecimal;

/**
 * 芒果装饰器
 */
public class CakeAddMangoDecorator extends CakeDecorator {
    public CakeAddMangoDecorator(Cake cake) {
        super(cake);
    }

    /**
     * 获取蛋糕的基本信息
     *
     * @return
     */
    @Override
    public String getCakeMsg() {
        return super.getCakeMsg()+"一个芒果";
    }

    /**
     * 获取蛋糕的价格
     *
     * @return
     */
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal("8"));
    }
}
