package cn.liangyy.observer.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * 好友类（观察者）
 */
public class Friends implements Observer {
    //看动态的人的名字
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        //获取（空间）被观察者数据
        Trends trends = new Trends();
        if (null != arg && arg instanceof Trends){
            trends = (Trends) arg;
        }
        System.out.println(this.getName()+",您好！您收到了来自 "+trends.getNickName()+" 的一条动态【"+trends.getContent()+"】，快去点赞吧！");
    }
}
