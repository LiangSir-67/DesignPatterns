package cn.liangyy.memento;

import java.util.Date;

/**
 * 存储文章快照类
 * 这个类和存储文章信息的类内部属性必须保持一致，否则无法通过快照类进行恢复，即使恢复了也不完整
 */
public class ArticleMemento {
    private String title;
    private String content;
    private Date createTime;

    public ArticleMemento(String title, String content, Date createTime) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
