package cn.liangyy.singleton;

/**
 * 静态内部类方式（JVM帮我们保证线程安全）
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-10:09
 */
public class Mgr05 {
    private Mgr05() {
    }

    private static class Mgr05Holder {
        private final static Mgr05 INSTANCE = new Mgr05();
    }

    public static Mgr05 getInstance() {
        return Mgr05Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}