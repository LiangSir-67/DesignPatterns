package cn.liangyy.template;

/**
 * 模板方法-测试类
 */
public class TestCooking {
    public static void main(String[] args) {
        CookingMeat cookingBeef = new CookingBeef();
        cookingBeef.cooking();
    }
}
