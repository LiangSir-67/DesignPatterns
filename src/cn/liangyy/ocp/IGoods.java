package cn.liangyy.ocp;

import java.math.BigDecimal;

/**
 * 商品接口
 */
public interface IGoods {
    /**
     * 获取商品名称
     * @return
     */
    String getName();

    /**
     * 获取商品每kg出售价格
     * @return
     */
    BigDecimal getSalePrice();
}
