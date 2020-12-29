package cn.liangyy.bridge;

/**
 * 桥接者类
 */
public abstract class AbstractBridgeMessage {
    //持有抽象维度的引用
    private IMessage iMessage;

    public AbstractBridgeMessage(IMessage iMessage){
        this.iMessage = iMessage;
    }

    /**
     * 定义一个和抽象维度类中具有相同功能的方法：发送消息
     * @param content
     * @param toUser
     */
    public void sendMessage(String content,String toUser){
        //调用抽象维度类中的方法
        this.iMessage.send(content,toUser);
    }
}
