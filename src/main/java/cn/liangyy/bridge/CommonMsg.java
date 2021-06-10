package cn.liangyy.bridge;

/**
 * 普通消息
 */
public class CommonMsg extends AbstractBridgeMessage {
    public CommonMsg(IMessage iMessage) {
        super(iMessage);
    }

    /**
     * 定义一个和抽象维度类中具有相同功能的方法：发送消息
     *
     * @param content
     * @param toUser
     */
    @Override
    public void sendMessage(String content, String toUser) {
        //做一点普通消息该做的事
        this.doSomething();
        //调用桥接者中的方法
        super.sendMessage(content, toUser);
    }

    private void doSomething(){
        System.out.println("我只是一个普通消息，我什么都不用做！");
    }
}
