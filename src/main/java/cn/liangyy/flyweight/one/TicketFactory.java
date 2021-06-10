package cn.liangyy.flyweight.one;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 * 管理享元对象，使用一个Map来存储对象，把火车票的起点和终点作为key，
 * 如果存在就取出来，否则就创建新对象，并且加到Map中。
 */
public class TicketFactory {
    //缓存对象
    private static Map<String,ITicket> CACHE_POOL = new HashMap<>();

    public static ITicket getTicketInfo(String from,String to){
        String key = from + "-->" + to;
        //如果对象存在缓存
        if (TicketFactory.CACHE_POOL.containsKey(key)){
            System.out.println("使用缓存");
            return TicketFactory.CACHE_POOL.get(key);
        }
        //对象不存在缓存则创建一个对象，并加入缓存
        System.out.println("未使用缓存");
        ITicket ticket = new TrainTicket("成都","西宁");
        CACHE_POOL.put(key,ticket);
        return ticket;
    }
}
