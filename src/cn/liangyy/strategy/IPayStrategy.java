package cn.liangyy.strategy;

import java.math.BigDecimal;

/**
 * 顶层的策略接口
 */
public interface IPayStrategy {
    /**
     * 支付
     * @param money 支付金额
     * @return
     */
    boolean pay(int money);

    /**
     * 查询余额
     * @return
     */
    BigDecimal queryBalance();
}
