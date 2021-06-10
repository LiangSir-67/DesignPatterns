package cn.liangyy.bridge;

/**
 * 站内消息类
 */
public class WebMessage implements IMessage {
    /**
     * 发送消息
     * @param content 消息内容
     * @param toUser  接收者
     */
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("站内消息 --> %s:%s",toUser, content));
    }
}
