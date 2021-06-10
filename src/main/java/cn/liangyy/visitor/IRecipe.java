package cn.liangyy.visitor;

/**
 * 食谱接口
 */
public interface IRecipe {
    /**
     * 食谱接受访问者顾客的访问，参数就是顾客
     * @param customer
     */
    void accept(ICustomer customer);
}
