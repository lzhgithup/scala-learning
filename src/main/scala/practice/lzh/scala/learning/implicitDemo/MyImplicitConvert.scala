package practice.lzh.scala.learning.implicitDemo

/**
 * 隐式转换
 */
object MyImplicitConvert {

  def main(args: Array[String]): Unit = {
    val num: Int = 3.5 //这里底层调用了f1$1(3.5)
    println(num) //输出 3
  }

  /**
   * 将这个隐式转换函数注释掉则上述代码报错，编译不通过
   *
   * @param d
   * @return
   */
  implicit def f1(d: Double): Int = { //底层生成了f1$1(...)
    d.toInt
  }
}
