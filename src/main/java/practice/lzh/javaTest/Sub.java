package practice.lzh.javaTest;

/**
 * @author ：lizhihao
 * @description：TODO
 * @date ：2020/5/17
 */
public class Sub extends SupperT {

    private String name = "sub";

    public int age = 18;

    @Override
    public void supperTest() {
        System.out.println("sub ...");
    }

//    @Override
//    public void visitName() {
//        System.out.println("name:" + this.name);
//    }

    public static void main(String[] args) {
        SupperT sup = new Sub();
        //由于动态绑定机制，所以调用子类重写的supperTest()方法，若子类没有重写supperTest()方法，那么会调用父类的supperTest()方法
        //动态绑定机制只针对方法
        //理解java的动态绑定机制，有助于理解scala中字段重写的原理
        sup.supperTest();
        sup.visitName(); //若子类未重写visitName()，那么输出结果为：name:Supper

        //属性不可以被重写，此时访问的还是父类的age
        System.out.println(sup.age);
    }
}
