package cn.liangyy.chain.one;

/**
 * 校验权限信息节点类
 * "链路"节点之一
 */
public class VerifyPermissionhandler extends MyHandler {
    @Override
    public void doHandler(LoginUser loginUser) {
        if (!"admin".equals(loginUser.getPermission())){
            System.out.println("暂无权限!");
            return;
        }
        System.out.println("权限校验通过，登录成功！");
    }
}
