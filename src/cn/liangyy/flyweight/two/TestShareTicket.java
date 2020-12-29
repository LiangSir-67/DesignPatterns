package cn.liangyy.flyweight.two;

/**
 * 享元模式-测试
 */
public class TestShareTicket {
    public static void main(String[] args) {
        IShareTicket ticket = TicketShareFactory.getTicketInfo("成都","西宁");
        ticket.setSeat("硬座");       //外部状态
        ticket.info();      //首次创建对象
        ticket = TicketShareFactory.getTicketInfo("成都","西宁");
        ticket.setSeat("硬卧");       //外部状态
        ticket.info();      //外部状态改变了，但是内部状态共享，依然可以使用缓存
    }
}
