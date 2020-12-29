package cn.liangyy.simple;

/**
 * 简单工厂类
 */
public class SimpleFactory {
    /**
     * 普通方法
     * @param productType
     * @return
     */
    public IProduct createProduct(String productType){
        if ("apple".equals(productType)){
            return new Apple();
        }else if ("orange".equals(productType)){
            return new Orange();
        }
        return null;
    }

    /**
     * 优化方法
     * @param clazz
     * @return
     * @throws Exception
     */
    public IProduct createProduct2(Class<? extends IProduct> clazz) throws Exception {
        if (null == clazz){
            throw new Exception("无法识别的产品");
        }
        return clazz.newInstance();
    }
}
