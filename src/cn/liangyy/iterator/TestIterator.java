package cn.liangyy.iterator;

/**
 * 迭代器模式-测试
 */
public class TestIterator {
    public static void main(String[] args) {
        //初始化一个自定义集合
        IBaggageCollection iBaggageCollection = initBaggage();
        System.out.println("当前对象元素个数为："+iBaggageCollection.size()+"个！");
        //获取自定义迭代器
        IMyIterator<Baggage> it = iBaggageCollection.iterator();
        //开始迭代容器内元素
        while (it.hasNext()){
            Baggage baggage = it.next();
            System.out.println(baggage.getName());
        }
    }

    private static IBaggageCollection initBaggage() {
        IBaggageCollection iBaggageCollection = new BaggageCollectionImpl();
        //初始化10个箱子进集合等待迭代
        for (int i = 0;i < 10;i++){
            Baggage box = new Baggage("箱子"+(i+1));
            iBaggageCollection.add(box);
        }
        return iBaggageCollection;
    }
}
