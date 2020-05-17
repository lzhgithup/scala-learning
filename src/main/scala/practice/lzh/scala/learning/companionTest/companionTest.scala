package practice.lzh.scala.learning.companionTest

/**
 * scala中为了与Java进行交互，创造了伴生对象来模拟Java中的静态部分
 */
object companionTest {
  def main(args: Array[String]): Unit = {
    val c = new Clerk
    c.name = "d"
    // 由于sal属性被声明为私有的，所以无法通过c.sal访问sal属性
    // 私有属性可以被本类或者在伴生对象中访问
    c.showInfo()

    Clerk.test(c) //Clerk$.MODULE$.test(Clerk c)

    println(Clerk.age) // 在底层等价于Clerk$.MODULE$.age()
  }

}

/**
 * 当在同一个文件中，出现同名的class和object，那么：
 * 1.class xxx为伴生类，object xxx为伴生对象
 * 2.伴生类中写入非静态的内容，伴生对象中写入静态的内容
 * 3.class xxx编译后底层生成 xxx.class
 * 4.object xxx编译后底层生成 xxx$.class
 *
 */
class Clerk {
  var name: String = "jack"
  private var sal: Double = 9999.9

  def showInfo(): Unit = {
    println("name=" + this.name + "\n" + "sal=" + this.sal)
  }
}

object Clerk { //若在同一个包中我们没有创建对应的class Clerk，那么在编译后会自动生成一个Clerk.class
  var age:Int = 5

  def main(args: Array[String]): Unit = {
    val c = new Clerk
    c.sal = 889.8
    c.name = "jacket"
    test(c)
  }

  def test(c: Clerk): Unit = {
    println("name=" + c.name + "\n" + "sal=" + c.sal)
  }
}
