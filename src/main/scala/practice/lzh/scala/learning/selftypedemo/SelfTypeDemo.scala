package practice.lzh.scala.learning.selftypedemo

/**
 * 自身类型主要是为了解决循环依赖
 */
object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}

trait Logger01 {
  //1.明确告诉编译器，该trait的类型是Exception
  //2.混入该特质的普通类，也必须是Exception的子类
  this:Exception =>

  def log(): Unit = {
    //可以调用Exception的方法
    println(getMessage)
  }
}

//直接这么写会报错
//class Console extends Logger01 {}

//正确
class Console extends Exception with Logger01 {}
