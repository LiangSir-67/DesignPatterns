package cn.liangyy.state;

/**
 * 待支付状态类
 */
public class WaitPaidOrderState extends AbstractOrderState {
    public WaitPaidOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    /**
     * 待支付状态绑定支付行为
     */
    @Override
    public void payOrder() {
        System.out.println("支付成功！");
        //切换状态
        this.orderContext.setState(this.orderContext.waitDeliver);
    }

    /**
     * 不是待支付状态订单的行为
     */
    @Override
    public void deliver() {
        System.out.println("对不起，请先支付！");
    }

    /**
     * 不是待支付状态订单的行为
     */
    @Override
    public void receiveGoods() {
        System.out.println("对不起，请先支付！");
    }
}
