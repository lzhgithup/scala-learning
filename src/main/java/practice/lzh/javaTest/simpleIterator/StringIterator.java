package practice.lzh.javaTest.simpleIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 字符串迭代器
 * @author ：lizhihao
 * @description：TODO
 * @date ：2020/5/22
 */
public class StringIterator implements AbstractIterator<Character>, RichIterator<Character>{

    private String s;

    private int i = 0;

    public StringIterator(String s) {
        this.s = s;
    }

    @Override
    public boolean hasNext() {
        return i < s.length();
    }

    @Override
    public Character next() {
        char c = s.charAt(i);
        i++;
        return c;
    }

    @Override
    public void foreach(Consumer<Character> action) {
        while (hasNext()) {
            action.accept(next());
        }
    }

    public static void main(String[] args) {
        StringIterator stringIterator = new StringIterator("java");
        stringIterator.foreach(System.out::println);
    }
}
