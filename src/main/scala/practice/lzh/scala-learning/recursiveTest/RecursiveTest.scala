package practice.lzh.scala01.recursiveTest

object RecursiveTest {

  def main(args: Array[String]): Unit = {
    val sum = sumOfString("Hello")
    println("sum=" + sum)
  }

  /**
   * 计算字符串的Unicode 编码的乘积
   * @param s
   * @return
   */
  def sumOfString(s: String): Long = {
    if (s.length == 1) {
      s.charAt(0).toLong
    } else {
      s.take(1).charAt(0).toLong * sumOfString(s.drop(1))
    }
  }
}
