package cn.liangyy.memento;

import java.util.Date;

/**
 * 文章信息类
 */
public class ArticleText {
    //文章标题
    private String title;
    //文章内容
    private String content;
    //文章创建时间
    private Date createTime;

    public ArticleText(String title, String content, Date createTime) {
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

    /**
     * 保存快照
     * @return
     */
    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(this.title,this.content,this.createTime);
        return articleMemento;
    }

    /**
     * 还原文章
     * @param articleMemento
     */
    public void getArticleFromMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.createTime = articleMemento.getCreateTime();
    }
}
