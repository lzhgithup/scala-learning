package practice.lzh.scala.learning.fieldoverride.abstractfield

/**
 * 注意：var只能重写另一个抽象的var属性
 */
object AbstractDemo {
  def main(args: Array[String]): Unit = {
    println("ok...")
  }
}

abstract class A03 {
  var name: String //未初始化的属性就是抽象属性，抽象属性必须在抽象类中
  //底层生成两个抽象方法abstract name()、abstract name_$eq(..)
}

class Sub_A03 extends A03 {
  //如果我们在子类中重写了父类的抽象属性，本质上
  //是实现了抽象方法abstract name()和abstract name_$eq(..)；
  //override可以写也可以不写；
  //不能重写一个被var修饰的已初始化的变量。
  var name: String = "abc"
}

class A04(a:Int) {
  var age:Int = a
}
