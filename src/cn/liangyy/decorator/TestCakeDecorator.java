package cn.liangyy.decorator;

/**
 * 装饰者模式-测试
 */
public class TestCakeDecorator {
    public static void main(String[] args) {
        Cake cake = null;
        //普通蛋糕
        cake = new BaseCake();
        System.out.println(cake.getCakeMsg()+",价格 "+cake.getPrice());
        //加一个芒果
        cake = new CakeAddMangoDecorator(cake);
        System.out.println(cake.getCakeMsg()+",价格 "+cake.getPrice());
        //加一个葡萄
        cake = new CakeAddGrapeDecorator(cake);
        System.out.println(cake.getCakeMsg()+",价格 "+cake.getPrice());
        //再加一个芒果
        cake = new CakeAddMangoDecorator(cake);
        System.out.println(cake.getCakeMsg()+",价格 "+cake.getPrice());
    }
}
