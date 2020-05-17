package practice.lzh.scala.learning.mylazy

/**
 * scala懒加载测试
 * 预测执行结果:
 *            --------------
 *            sum()执行了......
 *            res=65
 * 可以看到虽然我们在main函数体内第一行调用了sum函数，但是它并没有执行，只有在被真正需要时才会去执行并返回结果
 */
object LazyTest {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(45,20)
    println("----------------")
    println("res=" + res)
  }

  def sum(n1:Int,n2:Int):Int = {
    println("sum()执行了....")
    n1+n2
  }
}
