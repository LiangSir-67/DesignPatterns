package cn.liangyy.observer.pull;

/**
 * 空间动态类
 * 记录动态信息
 */
public class Trends {
    //发表动态的用户昵称
    private String nickName;
    //发表的动态内容
    private String content;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
