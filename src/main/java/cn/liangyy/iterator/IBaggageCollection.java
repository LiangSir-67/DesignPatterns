package cn.liangyy.iterator;

/**
 * 集合接口类
 */
public interface IBaggageCollection {
    /**
     * 添加元素
     * @param baggage
     */
    void add(Baggage baggage);

    /**
     * 移除元素
     * @param baggage
     */
    void remove(Baggage baggage);

    /**
     * 集合大小
     * @return
     */
    int size();

    /**
     * 构建一个迭代器对象
     * @return
     */
    IMyIterator<Baggage> iterator();
}
