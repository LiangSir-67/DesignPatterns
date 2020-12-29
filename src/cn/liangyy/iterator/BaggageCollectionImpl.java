package cn.liangyy.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的集合类
 */
public class BaggageCollectionImpl implements IBaggageCollection {
    private List list;

    public BaggageCollectionImpl() {
        this.list = new ArrayList();
    }

    /**
     * 添加元素
     * @param baggage
     */
    @Override
    public void add(Baggage baggage) {
        list.add(baggage);
    }

    /**
     * 移除元素
     * @param baggage
     */
    @Override
    public void remove(Baggage baggage) {
        list.remove(baggage);
    }

    /**
     * 集合大小
     * @return
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * 构建一个迭代器对象
     * @return
     */
    @Override
    public IMyIterator<Baggage> iterator() {
        //返回一个自定义迭代器
        return new MyIteratorImpl<Baggage>(list);
    }
}
