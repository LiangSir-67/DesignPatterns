package cn.liangyy.strategy;

import java.math.BigDecimal;

/**
 * 微信支付类
 */
public class WeChatPayStrategy implements IPayStrategy {
    /**
     * 支付
     *
     * @param money 支付金额
     * @return
     */
    @Override
    public boolean pay(int money) {
        System.out.println("微信支付成功！");
        return true;
    }

    /**
     * 查询余额
     *
     * @return
     */
    @Override
    public BigDecimal queryBalance() {
        System.out.println("微信余额为 30 元！");
        return new BigDecimal("30");
    }
}
