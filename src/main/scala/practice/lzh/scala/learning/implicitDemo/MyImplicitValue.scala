package practice.lzh.scala.learning.implicitDemo

/**
 * 隐式值
 */
object MyImplicitValue {

  def main(args: Array[String]): Unit = {

    implicit val m = "scala"
    //implicit val m1 = "scala ..."

    //当存在隐式值和默认值时，隐式值优先级更高，当没有隐式值时，才会使用默认值
    //同时隐式值不允许有二义性
    def test01(implicit s:String = "hello") :Unit = {
      println("test01:" + s)
    }
    test01 //输出 test01:scala
  }
}
