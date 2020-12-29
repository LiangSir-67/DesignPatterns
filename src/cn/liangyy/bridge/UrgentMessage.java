package cn.liangyy.bridge;

/**
 * 紧急消息类
 */
public class UrgentMessage extends AbstractBridgeMessage {
    public UrgentMessage(IMessage iMessage) {
        super(iMessage);
    }

    /**
     * 定义一个和抽象维度类中具有相同功能的方法：发送消息
     * @param content
     * @param toUser
     */
    @Override
    public void sendMessage(String content, String toUser) {
        //做点紧急消息需要做的事情
        this.doSomething();
        //调用桥接者中的方法
        super.sendMessage(content, toUser);
    }

    private void doSomething() {
        System.out.println("这是紧急消息，请优先发送！");
    }
}
