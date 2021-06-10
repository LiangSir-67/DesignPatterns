package cn.liangyy.adapter;

/**
 * 原始登录类
 */
public class LoginService {
    //为了方便理解，我们忽略注册功能，只考虑登录
    public void login(String userName,String password){
        System.out.println("登录成功，"+userName+" 欢迎您~");
    }
}
