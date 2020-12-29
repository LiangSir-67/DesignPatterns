package cn.liangyy.iterator;

import java.util.List;

/**
 * 具体的迭代器类
 */
public class MyIteratorImpl<E> implements IMyIterator<E> {
    //需要迭代的集合
    private List<E> list;
    //游标，即集合中元素的位置
    private int cursor;
    //集合中的元素
    private E element;
    //集合中的大小
    private int size;

    public MyIteratorImpl(List<E> list) {
        this.list = list;
        this.size = list.size();
    }

    /**
     * 遍历下一个元素
     */
    @Override
    public E next() {
        //根据游标获取当前元素
        E element = list.get(cursor);
        cursor++;
        return element;
    }

    /**
     * 是否有下一个元素
     */
    @Override
    public boolean hasNext() {
        return cursor != size;
    }
}
