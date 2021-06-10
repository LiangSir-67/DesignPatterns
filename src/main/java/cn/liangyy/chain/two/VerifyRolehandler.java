package cn.liangyy.chain.two;

/**
 * 校验角色信息节点类
 * "链路"节点之一
 */
public class VerifyRolehandler extends BuildHandler {
    @Override
    public void doHandler(LoginUser loginUser) {
        if (!"admin".equals(loginUser.getRoleName())){
            //校验角色信息
            System.out.println("角色信息有误!");
            return;
        }
        System.out.println("角色信息校验通过");
        //传递给下一个节点
        next.doHandler(loginUser);
    }
}
