package cn.liangyy.observer.pull;

import java.util.Observable;

/**
 * 空间类（被观察者）
 */
public class Zone extends Observable {
    //发表动态
    public void publishTrends(Trends trends){
        System.out.println(trends.getNickName()+" 发表了一个动态【"+trends.getContent()+"】");
        //占位，只是设置一个标记说明数据改变了
        setChanged();
        //通知所有观察者
        notifyObservers(trends);
    }
}
