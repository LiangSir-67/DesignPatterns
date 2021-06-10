package cn.liangyy.flyweight.two;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 * 管理享元对象，使用一个Map来存储对象，把火车票的起点和终点作为key，
 * 如果存在就取出来，否则就创建新对象，并且加到Map中。
 */
public class TicketShareFactory {
    //存储缓存对象
    private static Map<String,IShareTicket> CACHE_POOL = new HashMap<>();

    public static IShareTicket getTicketInfo(String from,String to){
        String key = from + "-->" + to;
        //如果对象存在缓存
        if (TicketShareFactory.CACHE_POOL.containsKey(key)){
            System.out.println("使用缓存");
            return TicketShareFactory.CACHE_POOL.get(key);
        }
        //对象不存在缓存则创建一个对象，并加入缓存
        System.out.println("未使用缓存");
        IShareTicket ticket = new TrainShareTicket(from,to);
        CACHE_POOL.put(key,ticket);
        return ticket;
    }
}
