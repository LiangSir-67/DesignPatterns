package cn.liangyy.method;

/**
 * 苹果工厂
 */
public class AppleFactory implements IFarmFactory {
    /**
     * 创建产品
     *
     * @return
     */
    @Override
    public IProduct create() {
        return new Apple();
    }
}
