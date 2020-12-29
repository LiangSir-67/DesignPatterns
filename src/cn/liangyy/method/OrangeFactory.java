package cn.liangyy.method;

/**
 * 橘子工厂
 */
public class OrangeFactory implements IFarmFactory {
    /**
     * 创建产品
     *
     * @return
     */
    @Override
    public IProduct create() {
        return new Orange();
    }
}
