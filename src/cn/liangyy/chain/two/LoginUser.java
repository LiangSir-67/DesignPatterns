package cn.liangyy.chain.two;

/**
 * 登录用户信息
 * 存储一些需要校验的信息
 */
public class LoginUser {
    //登录名
    private String loginName;
    //密码
    private String password;
    //角色
    private String roleName;
    //权限
    private String permission;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
