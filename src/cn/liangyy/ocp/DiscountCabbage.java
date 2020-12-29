package cn.liangyy.ocp;

import java.math.BigDecimal;

/**
 * 打折蔬菜类
 */
public class DiscountCabbage implements IGoods {
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
        return new BigDecimal("1.98");
    }
}
