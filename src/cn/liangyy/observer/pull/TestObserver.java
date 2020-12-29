package cn.liangyy.observer.pull;

/**
 * 观察者模式-测试
 */
public class TestObserver {
    public static void main(String[] args) {
        Zone zone = new Zone();
        //观察者，即查看好友动态的人
        Friends friends = new Friends();
        friends.setName("亚索");

        //被观察者，即发送动态的人
        Trends trends = new Trends();
        trends.setNickName("瑞雯");
        trends.setContent("此生唯爱亚索!");
        //注册观察者
        zone.addObserver(friends);
        //发布动态
        zone.publishTrends(trends);
    }
}
