package cn.liangyy.state;

/**
 * 抽象的订单状态类
 */
public abstract class AbstractOrderState {
    //订单上下文，用来负责状态切换
    protected OrderContext orderContext;

    public AbstractOrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    /**
     * 待支付状态订单对应行为：支付
     */
    public abstract void payOrder();

    /**
     * 已支付状态订单对应行为：发货
     */
    public abstract void deliver();

    /**
     * 已收货状态订单对应行为：收货
     */
    public abstract void receiveGoods();
}
