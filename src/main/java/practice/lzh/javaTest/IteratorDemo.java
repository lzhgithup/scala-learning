package practice.lzh.javaTest;

import practice.lzh.javaTest.simpleIterator.StringIterator;

/**
 * @author ：lizhihao
 * @description：TODO
 * @date ：2020/5/22
 */
public class IteratorDemo {

    public static void main(String[] args) {
        StringIterator stringIterator = new StringIterator("java");
        stringIterator.foreach(System.out::println);
    }
}
