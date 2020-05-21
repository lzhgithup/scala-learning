package practice.lzh.javaTest.simpleIterator;

/**
 * 字符串迭代器
 * @author ：lizhihao
 * @description：TODO
 * @date ：2020/5/22
 */
public class StringIterator extends RichIterator<Character>{

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
}
