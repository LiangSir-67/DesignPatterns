package cn.liangyy.flyweight.one;

/**
 * 火车票类
 */
public class TrainTicket implements ITicket {
    private String from;    //起点
    private String to;      //终点

    public TrainTicket(String from,String to){
        this.from = from;
        this.to = to;
    }

    /**
     * 查询车票信息
     */
    @Override
    public void info() {
        System.out.println(from + "-->" + to + ":硬座：100元，硬卧：200元");
    }
}
