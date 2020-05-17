package practice.lzh.scala.learning.forTest

import util.control.Breaks._

/**
 * 循环控制
 * scala内置控制结构特地去掉了break和continue，是为了更好地
 * 适应函数式编程，推荐使用函数式的风格解决break和continue的功能，而不是一个关键字。
 */
object ForDemo {

  def main(args: Array[String]): Unit = {
    //使用Range控制步长，从1遍历到10，步长为2
    for (i <- Range(1, 10, 2)) {
      println("range:" + i) //1,3,5,7,9
    }


    //这里，until相当于 [1,5)
    for (i <- 1 until 5) {
      println("until:" + i)
    }


    //将遍历过程中处理的结果返回到一个新的Vector集合中，使用yield关键字。
    //使用yield可以将表达式每一次执行的结果保存到一个Vector集合中
    val res = for (i <- 0 to 3) yield {
      (i + 32).toChar
    }
    println(res)


    //循环中断
    var m = 1
    breakable({
      while (m <= 20) {
        m += 1
        println(m)
        if (m == 18) {
          break() //在util.control.Breaks._包中，其实是抛出了一个异常。
        }
      }
    }) //breakable()捕获break()抛出的异常
    println("ok...") //ok被输出
  }
}
