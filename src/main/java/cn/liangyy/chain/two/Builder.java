package cn.liangyy.chain.two;

/**
 * "链路"对象的建造者类
 */
public class Builder<T> {
    //链路的头节点
    private BuildHandler<T> head;
    //链路的尾节点
    private BuildHandler<T> tail;

    public Builder<T> addHandler(BuildHandler handler){
        //如果头节点为空，则说明正在构建第一个节点，此时头尾节点都相等
        if (null == head){
            head = this.tail = handler;
            return this;
        }
        //如果节点不为空
        //把当前"链路"的tail节点的下一个节点指向刚加进来的节点
        this.tail.next(handler);
        //然后把当前加进来的节点设置为tail节点
        this.tail = handler;
        return this;
    }

    public BuildHandler<T> build(){
        //调用build之后就会开始调用流程了，从头节点开始，所以返回头节点
        return this.head;
    }
}
