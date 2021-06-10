package cn.liangyy.strategy;

/**
 * 策略模式-测试类
 */
public class TestPayStrategy {
    public static void main(String[] args) {
        //支付类型
        String pay = "aliPay";
        IPayStrategy payStrategy = null;
        //根据不同的支付类型，选择不同的支付种类
        if (pay.equals("aliPay")){
            payStrategy = new ALiPayStrategy();
        }else if (pay.equals("wechatPay")){
            payStrategy = new WeChatPayStrategy();
        }
        payStrategy.pay(10);
        payStrategy.queryBalance();
    }
}
