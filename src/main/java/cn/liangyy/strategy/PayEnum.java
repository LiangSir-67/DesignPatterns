package cn.liangyy.strategy;

/**
 * 枚举类
 * 用来维护所有的策略和key值对应关系
 */
public enum PayEnum {
    AliPay("aliPay",new ALiPayStrategy()),
    WechatPay("wechatPay",new WeChatPayStrategy());

    private String key;
    private IPayStrategy value;

    PayEnum(String key, IPayStrategy value) {
        this.key = key;
        this.value = value;
    }

    public static IPayStrategy getValue(String key){
        //遍历枚举类
        for (PayEnum payEnum : PayEnum.values()){
            if (payEnum.key.equals(key)){
                return payEnum.value;
            }
        }
        //如果没有合适的key就默认使用支付宝支付
        return new ALiPayStrategy();
    }
}
