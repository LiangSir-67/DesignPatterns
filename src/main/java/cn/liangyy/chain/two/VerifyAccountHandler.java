package cn.liangyy.chain.two;

/**
 * 校验账号密码节点类
 */
public class VerifyAccountHandler extends BuildHandler {
    @Override
    public void doHandler(LoginUser loginUser) {
        if (null == loginUser.getLoginName()){
            System.out.println("用户名不能为空！");
            return;
        }
        if (null == loginUser.getPassword()){
            System.out.println("密码不能为空!");
            return;
        }
        if (!loginUser.getPassword().equals("123")){
            System.out.println("密码不正确!");
            return;
        }
        System.out.println("账户密码校验通过！");
        //传递给下一个节点
        next.doHandler(loginUser);
    }
}
