package cn.liangyy.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 */
public class RestaurantMenu {
    //存储菜单中的菜，也就是数据结构中的元素
    private List<IRecipe> recipeList = new ArrayList<>();

    //初始化菜单
    public RestaurantMenu(IRecipe recipe) {
        recipeList.add(recipe);
    }

    //添加一道菜到菜单中，即添加一种数据类型到数据结构中
    public void addRecipe(IRecipe recipe){
        recipeList.add(recipe);
    }

    //展示菜单所有
    public void display(ICustomer customer){
        for (IRecipe recipe : recipeList){
            recipe.accept(customer);
        }
    }
}
