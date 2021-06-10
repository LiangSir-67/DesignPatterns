package cn.liangyy.bridge;

/**
 * 邮件消息类
 */
public class EmailMessage implements IMessage {
    /**
     * 发送消息
     * @param content 消息内容
     * @param toUser  接收者
     */
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("邮件消息 --> %s:%s",toUser, content));
    }
}
