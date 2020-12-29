package cn.liangyy.abstractFactory;

/**
 * 南方工厂
 */
public class SouthFarmFactory implements IFactory {
    @Override
    public IApple createApple() {
        return new SouthApple();    //南方农场生成南方苹果
    }

    @Override
    public IOrange createOrange() {
        return new SouthOrange();   //南方农场生成南方橘子
    }
}
