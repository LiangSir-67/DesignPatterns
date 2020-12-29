package cn.liangyy.visitor;

/**
 * 蔬菜类
 */
public class Cabbage implements IRecipe {
    /**
     * 食谱接受访问者顾客的访问，参数就是顾客
     * @param customer
     */
    @Override
    public void accept(ICustomer customer) {
        customer.visit(this);
    }

    /**
     * 获取价格
     * @return
     */
    public String getPrice(){
        return "16元/份";
    }
}
