package cn.liangyy.singleton;

/**
 * 枚举单例（完美的单例模式）
 * 不用担心线程安全的问题
 * 不仅可以解决线程同步，还可以防止反序列化
 * 
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-06-10-10:12
 */
public enum  Mgr06 {
    //唯一的取值，下面的调用只能调用这一个，没有争议
    INSTANCE;

    //剩下的都是业务方法
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.INSTANCE.hashCode());
            }).start();
        }
    }
}