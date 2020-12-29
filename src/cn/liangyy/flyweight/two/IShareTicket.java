package cn.liangyy.flyweight.two;

/**
 * 车票接口
 */
public interface IShareTicket {
    /**
     * 获取车票信息
     */
    void info();

    /**
     * 设置车票座位
     * @param seatType
     */
    void setSeat(String seatType);
}
