package cn.liangyy.ocp;

import java.math.BigDecimal;

/**
 * 蔬菜类
 */
public class Cabbage implements IGoods {
    /**
     * 获取商品名称
     *
     * @return
     */
    @Override
    public String getName() {
        return "蔬菜";
    }

    /**
     * 获取商品每kg出售价格
     *
     * @return
     */
    @Override
    public BigDecimal getSalePrice() {
        //表示每 3.98/kg
        return new BigDecimal("3.98");
    }

}
