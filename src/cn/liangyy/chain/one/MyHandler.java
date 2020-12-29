package cn.liangyy.chain.one;

/**
 * "链路"的抽象节点类
 * 维护下一个节点，并定义执行业务逻辑
 */
public abstract class MyHandler {
    //持有下一个节点对象，也就是每个节点都需要知道自己的下一个节点是谁才能传递下去
    protected  MyHandler next;

    public void next(MyHandler handler){
        this.next = handler;
    }

    //执行每个节点的处理逻辑
    public abstract void doHandler(LoginUser loginUser);
}
