package cn.liangyy.visitor;

/**
 * 具体访问者-顾客A
 */
public class CustomerA implements ICustomer {
    /**
     * 访问肉类菜
     * @param meat
     */
    @Override
    public void visit(Meat meat) {
        System.out.println("肉类："+meat.getPrice());
    }

    /**
     * 访问蔬菜类菜
     * @param cabbage
     */
    @Override
    public void visit(Cabbage cabbage) {
        System.out.println("时蔬："+cabbage.getPrice());
    }
}
