package cn.liangyy.state;

/**
 * 状态模式-测试
 */
public class TestState {
    public static void main(String[] args) {
        //创建订单上下文，默认待支付状态
        OrderContext orderContext = new OrderContext();
        //支付，支付完成之后状态自动切换到待发货
        orderContext.payOrder();
        //发货，发货完成之后状态自动切换到待收货
        orderContext.deliver();
        //收货
        orderContext.receiveGoods();
    }
}
