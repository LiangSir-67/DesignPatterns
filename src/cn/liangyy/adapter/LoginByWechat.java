package cn.liangyy.adapter;

/**
 * 微信登录
 */
public class LoginByWechat extends LoginService {
    @Override
    public void login(String userName, String password) {
        super.login(userName, password);
    }

    public void loginByTelephone(String telephone){
        //处理业务逻辑，如注册，存储手机号，校验验证码等操作
        //为了兼容之前的原始登录方式，可以初始化一个固定账户，密码
        System.out.println("************微信登录************");
        this.login(telephone,"设置好的密码");
    }
}
