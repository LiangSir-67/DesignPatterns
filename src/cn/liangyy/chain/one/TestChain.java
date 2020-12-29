package cn.liangyy.chain.one;

/**
 * 责任链模式-测试
 */
public class TestChain {
    public static void main(String[] args) {
        MyHandler accountHandler = new VerifyAccountHandler();
        MyHandler roleHandler = new VerifyRolehandler();
        MyHandler permissionHandler = new VerifyPermissionhandler();

        accountHandler.next(roleHandler);
        roleHandler.next(permissionHandler);

        LoginUser loginUser = new LoginUser();
        loginUser.setLoginName("liangsir");
        loginUser.setPassword("123");
        loginUser.setRoleName("admin");
        loginUser.setPermission("admin");
        //从起点开始调用
        accountHandler.doHandler(loginUser);
    }
}
