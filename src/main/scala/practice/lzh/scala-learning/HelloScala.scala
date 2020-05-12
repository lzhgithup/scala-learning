package practice.lzh.scala01

/**
 * 只要看到object，我们应该明确：
 * 1.object xxx对应的是一个xxx$类的一个静态对象MODULE$
 * 2.在整个运行过程中，是单例的。
 */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello,idea scala...")
    val num: Int = 3
    val s = math.sqrt(num.toDouble)
    val s2 = s * s
    println("3的平方根 = " + s)
    println("3 - s2 = " + (3 - s2))

    val i: BigInt = 2
    val res = i.<<(1023)
    println("2的1024次方=" + res)

    val s3: String = "Hello"
    val beginStr = s3.charAt(0)
    val endStr = s3.charAt(s3.length - 1)
    println("Hello的首字符:" + beginStr)
    println("Hello的尾字符:" + endStr)

  }
}
