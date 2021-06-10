package cn.liangyy.singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-10:03
 */
public class Mgr02 {
    private static Mgr02 INSRANCE;

    private Mgr02(){}

    public static Mgr02 getInstance(){
        if (INSRANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSRANCE = new Mgr02();
        }
        return INSRANCE;
    }

    public void m(){
        System.out.println("m");
    }


    public static void main(String args[]){
        //多线程测试
        for (int i = 0;i < 100;i++){
            new Thread(() -> {
                System.out.println(Mgr02.getInstance());
            }).start();
        }
    }
}