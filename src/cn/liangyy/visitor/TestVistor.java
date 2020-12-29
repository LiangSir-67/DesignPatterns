package cn.liangyy.visitor;

/**
 * 访问者模式-测试
 */
public class TestVistor {
    public static void main(String[] args) {
        //创建一道肉类菜
        IRecipe recipe = new Meat();
        //将肉类菜初始化到菜单中
        RestaurantMenu menu = new RestaurantMenu(recipe);
        //再添加一道素菜
        menu.addRecipe(new Cabbage());
        //顾客A开始访问菜单中的元素（菜）
        menu.display(new CustomerA());
    }
}
