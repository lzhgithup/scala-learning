package practice.lzh.javaTest.simpleIterator;

import java.util.function.Consumer;

abstract class RichIterator<T> implements AbstractIterator<T> {

    public void foreach(Consumer<T> action) {
        while (hasNext()) {
            action.accept(next());
        }
    }
}
