package practice.lzh.scala.learning.fieldoverride

/**
 * scala中，abstract只能用于修饰类，代表抽象类
 */
object AbstractDemo02 {
  def main(args: Array[String]): Unit = {
    println("ok......")
    println("============")
    val a = new AbstractDemo002 {
      //该override可以省略
      override def sayHi(): Unit = {
        println(this.name)
      }
    }
    a.sayHi()
    println("============")
  }
}

abstract class AbstractDemo02 { //抽象类
  var name: String //抽象属性
  var age: Int //抽象属性
  var weight: Int = 78 //普通字段
  def cry() //抽象方法
}

abstract class AbstractDemo002 {
  var name: String = "sayHi~~name"

  def sayHi()
}
