package cn.liangyy.bridge;

/**
 * 桥接模式-测试
 */
public class TestBridge {
    public static void main(String[] args) {
        System.out.println("*******************************");
        //紧急邮件消息
        IMessage iMessage = new EmailMessage();
        AbstractBridgeMessage abstractBridgeMessage = new UrgentMessage(iMessage);
        abstractBridgeMessage.sendMessage("你好！","亚索");
        //普通短信消息
        System.out.println("*******************************");
        iMessage = new SmsMessage();
        abstractBridgeMessage = new CommonMsg(iMessage);
        abstractBridgeMessage.sendMessage("你好！","武器");

        //紧急站内信
        System.out.println("*******************************");
        iMessage = new WebMessage();
        abstractBridgeMessage = new UrgentMessage(iMessage);
        abstractBridgeMessage.sendMessage("你好！","剑圣");
        System.out.println("*******************************");

    }
}
