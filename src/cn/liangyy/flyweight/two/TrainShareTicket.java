package cn.liangyy.flyweight.two;

import java.math.BigDecimal;

/**
 * 火车票类
 */
public class TrainShareTicket implements IShareTicket {
    private String from;    //内部状态
    private String to;      //内部状态

    private String seatType = "站票";     //外部状态

    public TrainShareTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * 获取车票信息
     */
    @Override
    public void info() {
        System.out.println(from + "-->" + to + ":" + seatType + this.getPrice(seatType));
    }


    /**
     * 设置车票座位
     *
     * @param seatType
     */
    @Override
    public void setSeat(String seatType) {
        this.seatType = seatType;
    }

    //获取不同座位的价格
    private BigDecimal getPrice(String seatType) {
        BigDecimal value = null;
        switch (seatType) {
            case "硬座":
                value = new BigDecimal("100");
                break;
            case "硬卧":
                value = new BigDecimal("200");
                break;
            default:
                value = new BigDecimal("50");
        }
        return value;
    }
}
