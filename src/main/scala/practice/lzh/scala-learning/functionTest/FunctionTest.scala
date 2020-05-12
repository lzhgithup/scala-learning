package practice.lzh.scala01.functionTest

/**
 * 方法、函数的关系
 */
object FunctionTest {
  def main(args: Array[String]): Unit = {
    //以前调用方法
    val test01 = new Test01
    val sum1 = test01.getSum(10, 20)
    println("sum1=" + sum1)
    //方法转函数
    val f1 = test01.getSum _
    println("f1=" + f1)
    println("f1=" + f1(50, 90))
    //直接定义函数并赋给一个变量
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }

    println("f2=" + f2)
    println("f2=" + f2(58, 89))


    val b = odd(5)
    println("b=" + b)
  }

  /**
   * 判断一个数的奇偶性
   *
   * @param n
   * @return
   */
  def odd(n: Long): Boolean = {
    1.&(n) == 1
  }
}

class Test01 {
  //方法
  def getSum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
