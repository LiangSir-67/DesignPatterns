package cn.liangyy.decorator;

import java.math.BigDecimal;

/**
 * 原生蛋糕类（纯奶油蛋糕）
 */
public class BaseCake extends Cake {

    /**
     * 获取蛋糕的基本信息
     *
     * @return
     */
    @Override
    public String getCakeMsg() {
        return "我是一个蛋糕";
    }

    /**
     * 获取蛋糕的价格
     *
     * @return
     */
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("68");
    }
}
