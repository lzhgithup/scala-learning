package practice.lzh.scala.learning.nestedClass

/**
 * 外部类
 * class MyOuter是object MyOuter的伴生类
 */
class MyOuter {
  /**
   * 外部类实例的别名
   */
  myOuter1 =>
  /**
   * 成员内部类
   */
  class MyInner {

    def test01(): Unit = {
      //访问外部类属性
      println("外部类属性:" + MyOuter.this.name)
      //使用外部类别名访问外部类成员属性，给外部类取别名时要将其他的类成员放置在成员内部类的下面
      println("外部类属性:" + myOuter1.age)
    }
  }

  private var name: String = "lucy"

  private var age: Int = 20

  def test01(s: String):Any = {
    if (s.contains("age")) {
      age
    } else {
      name
    }
  }

}

//object MyOuter是class MyOuter的伴生对象
object MyOuter {

  /**
   * 静态内部类
   */
  class MyStaticInner {
    var sal:Double = 88.9
  }


  def main(args: Array[String]): Unit = {
    val myOuter = new MyOuter
    println("outer class:" + myOuter.test01("age"))

    //创建成员内部类实例：new 外部类实例.内部类，从这里可以看出，内部类实例与外部类实例是绑定的
    //或者类型推导：val myInner = new myOuter.MyInner
    val myInner: myOuter.MyInner = new myOuter.MyInner
    myInner.test01()

    //创建静态内部类实例
    val myStaticInner = new MyOuter.MyStaticInner
    println("static inner:" + myStaticInner.sal)
  }
}
