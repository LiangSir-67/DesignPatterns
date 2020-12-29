package cn.liangyy.flyweight.one;

/**
 * 享元模式-测试
 */
public class TestTicket {
    public static void main(String[] args) {
        //首次创建对象
        ITicket ticket = TicketFactory.getTicketInfo("成都","西宁");
        ticket.info();
        //使用缓存
        ticket = TicketFactory.getTicketInfo("成都","西宁");
        ticket.info();
        //换了终点，，无法使用缓存
        ticket = TicketFactory.getTicketInfo("成都","上海");
        ticket.info();
    }
}
