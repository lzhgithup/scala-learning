package practice.lzh.scala.learning.scalaJavaTest;

/**
 * @author ：lizhihao
 * @description：scala的Java运行模拟，scala在运行时做了一层包装
 * @date 2020/3/28
 */
public class ScalaTest {
    public static void main(String[] args) {
        ScalaTest$.MODULE$.main(args);
    }
}

final class ScalaTest${
    static final ScalaTest$ MODULE$;

    static {
        MODULE$ = new ScalaTest$();
    }

    public void main(String[] args){
        System.out.println("hello,idea scala...");
    }
}
