package cn.liangyy.bridge;

/**
 * 子系统
 */
public interface IMessage {
    /**
     * 发送消息
     * @param content   消息内容
     * @param toUser    接收者
     */
    void send(String content,String toUser);
}
