package cn.liangyy.ocp;

/**
 * 开闭原则-测试类
 */
public class TestOCP {
    public static void main(String[] args) {
        //获取蔬菜的原价
        System.out.println("蔬菜原价：" + new Cabbage().getSalePrice());
        //获取蔬菜打折后的价格
        System.out.println("蔬菜打折价：" + new DiscountCabbage().getSalePrice());
    }
}
