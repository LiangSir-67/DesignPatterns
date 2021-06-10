package cn.liangyy.simple;

/**
 * 简单工厂-测试类
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IProduct apple = factory.createProduct("apple");
        apple.grow();   //输出：种植苹果

        IProduct orange = factory.createProduct("orange");
        orange.grow();  //输出：种植橘子
    }
}
