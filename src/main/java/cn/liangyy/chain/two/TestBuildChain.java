package cn.liangyy.chain.two;

/**
 * 责任链模式-测试
 */
public class TestBuildChain {
    public static void main(String[] args) {
        LoginUser loginUser = new LoginUser();
        loginUser.setLoginName("liangsir");
        loginUser.setPassword("123");
        loginUser.setRoleName("admin");
        loginUser.setPermission("admin");

        Builder<BuildHandler> build = new Builder<>();
        //利用建造者模式构建"链路对象"
        build.addHandler(new VerifyAccountHandler())
                .addHandler(new VerifyRolehandler())
                .addHandler(new VerifyPermissionhandler());
        //build方法返回头节点，所以从头节点开始执行，后面就会自动传递
        build.build().doHandler(loginUser);
    }
}
