package cn.liangyy.adapter;

/**
 * 适配器模式-测试
 */
public class TestLoginAdapter {
    public static void main(String[] args) {
        //手机登录适配器
        LoginByTelephone loginByTelephone = new LoginByTelephone();
        loginByTelephone.loginByTelephone("电话号");

        //微信登录适配器
        LoginByWechat loginByWechat = new LoginByWechat();
        loginByWechat.loginByTelephone("电话号/微信号");

        //QQ登录适配器
        LoginByQQ loginByQQ = new LoginByQQ();
        loginByQQ.loginByTelephone("QQ号");
    }
}
