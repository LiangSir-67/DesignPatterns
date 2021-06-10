package cn.liangyy.strategy;

public class TestPayStrategy2 {
    public static void main(String[] args) {
        IPayStrategy iPayStrategy = PayEnum.getValue("aliPay");
        iPayStrategy.pay(10);
        iPayStrategy.queryBalance();
    }
}
