package cn.liangyy.strategy;

import java.math.BigDecimal;

/**
 * 支付宝支付类
 */
public class ALiPayStrategy implements IPayStrategy {
    /**
     * 支付
     *
     * @param money 支付金额
     * @return
     */
    @Override
    public boolean pay(int money) {
        System.out.println("支付宝支付成功！");
        return true;
    }

    /**
     * 查询余额
     *
     * @return
     */
    @Override
    public BigDecimal queryBalance() {
        System.out.println("支付宝余额为 20 元！");
        return new BigDecimal("20");
    }
}
