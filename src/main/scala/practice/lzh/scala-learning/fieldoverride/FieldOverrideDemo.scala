package practice.lzh.scala01.fieldoverride

/**
 * scala中的字段覆写
 */
object FieldOverrideDemo {
  def main(args: Array[String]): Unit = {
    val obj1: ASuper = new BSub
    val obj2: BSub = new BSub
    //对于obj1，实质上访问age是通过obj1.age()方法访问的，由于Java的动态绑定机制，
    // obj1指向的是子类对象的内存地址，因此这里访问的是子类的age()方法
    //对于obj2，它访问age就是age()方法
    //显然，由于都是通过方法访问，所以才会因为Java中的方法的动态绑定机制实现了覆写，若只是单纯
    //地访问属性，由于Java中属性没有动态绑定机制，所以不会实现覆写。
    print("obj1.age=" + obj1.age + "\t obj2.age=" + obj2.age)
  }
}

class ASuper {
  val age: Int = 20
}

class BSub extends ASuper {
  override val age: Int = 30
}
