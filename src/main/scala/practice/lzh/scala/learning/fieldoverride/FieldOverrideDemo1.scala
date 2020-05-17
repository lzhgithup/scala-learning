package practice.lzh.scala.learning.fieldoverride

/**
 * (1)def只能重写另一个def，即方法只能重写另一个方法。
 * (2)val只能重写另一个val或重写不带参数的def。
 */
object FieldOverrideDemo1 {
  def main(args: Array[String]): Unit = {
    val obj1 = new B
    //假设以下代码是合法的
    //obj1.name = "hh" //由于子类中没有赋值的方法，相当于调用了父类的name_$eq()
    println(obj1.name) //由于Java的动态绑定机制，相当于调用了子类的name()
    //此时会出现name值的设置和获取不一致

    val obj2:A = new B
    println("obj2.sal=" + obj2.sal)
  }
}

class A {
  val name: String = "a" //底层生成public name()和public name_$eq(..)

  def sal(): Int = {
    10
  }
}

class B extends A {
  override val name: String = "b" //由于是val修饰，底层只生成public name()，val只能重写val，父类若是var，编译时会报错

  override val sal: Int = 90 //父类有sal()，子类也会在底层生成sal()，实际上就是重写了父类的sal()方法，那么此时就会返回90
}
