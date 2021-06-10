package cn.liangyy.singleton;

/**
 * 加锁解决Mgr02中出现的线程不安全问题
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-10:05
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){}

    public static synchronized Mgr03 getInstance(){
        if (INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}