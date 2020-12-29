package cn.liangyy.iterator;

/**
 * 迭代器接口
 */
public interface IMyIterator<E> {
    /**
     * 遍历下一个元素
     */
    E next();

    /**
     * 是否有下一个元素
     */
    boolean hasNext();
}
