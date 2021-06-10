package cn.liangyy.abstractFactory;

/**
 * 抽象工厂-测试类
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        //构建南方农场
        IFactory southFarmFactory = new SouthFarmFactory();
        //获得南方苹果
        IApple apple = southFarmFactory.createApple();
        //输出：种植南方苹果
        apple.growApple();

        //获得南方橘子
        IOrange orange = southFarmFactory.createOrange();
        //输出：种植南方橘子
        orange.growOrange();
    }
}
