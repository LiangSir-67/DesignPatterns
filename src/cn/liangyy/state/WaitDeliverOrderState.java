package cn.liangyy.state;

/**
 * 代发货状态类
 */
public class WaitDeliverOrderState extends AbstractOrderState {
    public WaitDeliverOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    /**
     * 不是代发货状态订单的行为
     */
    @Override
    public void payOrder() {
        System.out.println("你已经支付过了！");
    }

    @Override
    public void deliver() {
        System.out.println("商品已发货并送达！");
        //切换状态
        this.orderContext.setState(this.orderContext.receiveGoods);
    }

    /**
     * 不是代发货状态订单的行为
     */
    @Override
    public void receiveGoods() {
        System.out.println("请不要着急，商品即将发货！");
    }
}
