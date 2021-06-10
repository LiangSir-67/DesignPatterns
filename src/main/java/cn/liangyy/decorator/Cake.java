package cn.liangyy.decorator;

import java.math.BigDecimal;

/**
 * 蛋糕类
 */
public abstract class Cake {
    /**
     * 获取蛋糕的基本信息
     * @return
     */
    public abstract String getCakeMsg();

    /**
     * 获取蛋糕的价格
     * @return
     */
    public abstract BigDecimal getPrice();
}
