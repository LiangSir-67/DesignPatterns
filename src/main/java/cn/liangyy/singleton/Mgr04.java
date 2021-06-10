package cn.liangyy.singleton;

/**
 * 懒汉式
 * 使用双重检查保证线程安全，但也带来了效率的下降
 * 这是目前好的解决方法之一
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-10:07
 */
public class Mgr04 {
    /**
     * volatile：保证线程可见性，不具有原子性
     * 当将volatile加到变量上，该变量的初始化过程将不被指令重排序
     */
    private static volatile Mgr04 INSTANCE;

    private Mgr04(){}

    public static Mgr04 getInstance(){
        if (INSTANCE == null){
            //双重检查
            synchronized (Mgr04.class){
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr04();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}