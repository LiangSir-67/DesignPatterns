package cn.liangyy.state;

/**
 * 待收货状态类
 */
public class ReceiveGoodsOrderState extends AbstractOrderState {
    public ReceiveGoodsOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    /**
     * 不是待收货状态订单的行为
     */
    @Override
    public void payOrder() {
        System.out.println("你已经支付过了，请不要重复支付！");
    }

    /**
     * 不是待收货状态订单的行为
     */
    @Override
    public void deliver() {
        System.out.println("商品已发货并送达，请不要重复发货！");
    }

    @Override
    public void receiveGoods() {
        System.out.println("用户已收到商品，此次交易结束！");
    }
}
