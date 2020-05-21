package practice.lzh.scala.learning.traitDemo

/**
 * trait、abstract class、class的结合使用，实现一个简单的迭代器
 */
object TraitDemo3 {
  def main(args: Array[String]): Unit = {
    val iterator = new StringRich("scala")
    iterator.foreach(println)
  }
}

abstract class AbsIterator {
  type T

  def hasNext(): Boolean

  def next(): T
}

class StringIterator(s: String) extends AbsIterator {

  private var i: Int = 0

  override type T = Char

  override def hasNext(): Boolean = i < s.length

  override def next(): Char = {
    val c = s.charAt(i)
    i += 1
    c
  }
}

/**
 * trait继承AbsIterator，并且通过调用hasNext和next方法实现了foreach方法
 * 因为RichIterator是一个trait，所以它不用实现抽象类里的抽象成员
 */
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit):Unit = while (hasNext()) f(next())
}

/**
 * 继承StringIterator，并混入迭代器，这样它就同时拥有了两者的方法
 * @param s
 */
class StringRich(s:String) extends StringIterator(s) with RichIterator