package practice.lzh.scala.learning.implicitDemo

/**
 * 隐式类 demo
 * 当我们在隐式类的作用域范围内创建它所接受的类型的实例时，那么隐式类就会起作用；
 * 隐式类必须在class、object、包对象里面
 */
object MyImplicitClass {

  //隐式类，有且只有一个构造参数
  implicit class MyImplicitClass01(m: MyImplicitClass) {
    def jump(s: String): Unit = {
      println(s + ":jump !")
    }
  }

  def main(args: Array[String]): Unit = {
    val m = new MyImplicitClass
    m.say("hello ~")
    m.jump("xiao ming") //在未调用jump方法时，还没有发生隐式转换，调用了就发生了
  }
}

class MyImplicitClass {

  def say(s: String): Unit = {
    println("say:" + s)
  }

}
