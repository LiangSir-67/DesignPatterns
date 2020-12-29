package cn.liangyy.visitor;

/**
 * 抽象的访问者-顾客
 * 访问者中的方法个数应该与和访问数据结构中的数据种类数相同
 * (被访问者访问的数据结构 --> 菜)
 */
public interface ICustomer {
    /**
     * 访问肉类菜
     * @param meat
     */
    void visit(Meat meat);

    /**
     * 访问蔬菜类菜
     * @param cabbage
     */
    void visit(Cabbage cabbage);
}
