package cn.liangyy.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例一个单例，JVM保证线程安全
 * 优点：简单实用，推荐使用
 * 缺点：不管用到与否，类装载时就完成实例化
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-9:56
 */
public class Mgr01 {
    //一开始就新建一个实例
    private static final Mgr01 INSTSNCE = new Mgr01();

    //默认构造方法
    private Mgr01() {};

    //获得实例的方法
    public static Mgr01 getInstance(){
        return INSTSNCE;
    }

    //模拟其他业务方法
    public void m() {
        System.out.println("m");
    }

    //具体用来测试
    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
        System.out.println(m1);
        System.out.println(m2);
        for (int i = 0; i < 100; i++) {
            System.out.println(Mgr01.getInstance().hashCode());
        }
    }
}