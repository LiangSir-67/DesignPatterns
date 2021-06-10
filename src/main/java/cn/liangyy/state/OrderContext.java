package cn.liangyy.state;

/**
 * 订单上下文类
 */
public class OrderContext {
    //待支付状态
    AbstractOrderState waitPaid;
    //代发货状态
    AbstractOrderState waitDeliver;
    //待收货状态
    AbstractOrderState receiveGoods;

    //当前状态
    AbstractOrderState currState;

    public OrderContext() {
        //初始化 待支付 状态订单
        this.waitPaid = new WaitPaidOrderState(this);
        //初始化 待发货 状态订单
        this.waitDeliver = new WaitDeliverOrderState(this);
        //初始化 待收货 状态订单
        this.receiveGoods = new ReceiveGoodsOrderState(this);
        //当前状态，默认待支付
        currState = waitPaid;
    }

    void setState(AbstractOrderState state){
        this.currState = state;
    }

    //支付
    public void payOrder(){
        currState.payOrder();
    }

    //发货
    public void deliver(){
        currState.deliver();
    }

    //收货
    public void receiveGoods(){
        currState.receiveGoods();
    }
}
