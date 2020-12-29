package cn.liangyy.simple;

/**
 * 橘子类
 */
public class Orange implements IProduct {
    /**
     * 种植水果
     */
    @Override
    public void grow() {
        System.out.println("种植橘子");
    }
}
