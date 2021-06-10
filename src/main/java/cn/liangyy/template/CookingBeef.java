package cn.liangyy.template;

/**
 * 炒牛肉类
 * 假设炒牛肉需要放姜
 */
public class CookingBeef extends CookingMeat {
    @Override
    void putSeasoning() {
        System.out.println("放点姜...");
    }
}
