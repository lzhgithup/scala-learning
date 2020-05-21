package practice.lzh.javaTest.simpleIterator;

import java.util.function.Consumer;

public interface RichIterator<T> extends AbstractIterator<T> {

    void foreach(Consumer<T> action);
}
