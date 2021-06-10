package cn.liangyy.simple;

/**
 * 苹果类
 */
public class Apple implements IProduct {
    /**
     * 种植水果
     */
    @Override
    public void grow() {
        System.out.println("种植苹果");
    }
}
