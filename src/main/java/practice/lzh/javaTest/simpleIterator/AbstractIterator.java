package practice.lzh.javaTest.simpleIterator;

/**
 * @author ：lizhihao
 * @description：TODO
 * @date ：2020/5/22
 */
public interface AbstractIterator<T> {

    boolean hasNext();

    T next();
}
