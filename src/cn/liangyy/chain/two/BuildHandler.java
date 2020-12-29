package cn.liangyy.chain.two;

/**
 * "链路"的抽象节点
 */
public abstract class BuildHandler<T> {
    //持有下一个节点对象，也就是每个节点都需要知道自己的下一个节点是谁才能传递下去
    protected BuildHandler next;

    public void next(BuildHandler handler){
        this.next = handler;
    }

    //执行每个节点的处理逻辑
    public abstract void doHandler(LoginUser loginUser);
}
