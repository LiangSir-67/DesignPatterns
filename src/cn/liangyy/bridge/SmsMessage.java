package cn.liangyy.bridge;

/**
 * 短信消息类
 */
public class SmsMessage implements IMessage {
    /**
     * 发送消息
     * @param content 消息内容
     * @param toUser  接收者
     */
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("SMS消息 --> %s:%s",toUser, content));
    }
}
