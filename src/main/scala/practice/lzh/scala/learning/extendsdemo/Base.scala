package practice.lzh.scala.learning.extendsdemo

/**
 * 访问权限修饰符测试
 */
object AccessTest {
  def main(args: Array[String]): Unit = {
    val s = new Sub
    s.name = "jack"
    //s.age = 52 age被protected修饰，只能在本类和子类中访问到，即便同包也无法访问
    s.baseAccessTest("ddd12")//id被private修饰，只能通过从父类继承下来的方法访问
    s.subAccessTest()
    //在这里无法访问被protected和private修饰的方法
    //s.test01() //test01()被protected，被编译成Java代码后test01()是被public修饰的，但是为什么无法？
               //那是因为scala编译器从语法层面上限制了访问，调用就报错，连语法都过不去，我们又如何编译我们的代码去运行呢？
  }
}

class Base {
  var name = ""
  private var id = "hhh123" //Java源码中提供了id()和id_$eq()方法，但它们都被private修饰
  protected var age = 0

  def baseAccessTest(id:String): Unit ={
    this.id = id
    println("private id="+this.id)
  }

  protected def test01(): Unit ={
    println("test01~~")
  }

  private def test02(): Unit ={
    println("test02~~")
  }
}

class Sub extends Base {

  def subAccessTest(): Unit = {
    this.age = 34
    println("name=" + this.name)
    println("protected age=" + this.age)
    //this.id = "sdfjsf11"，id被private修饰，无法访问
  }

  def accessProtected(): Unit ={
    test01() //test01()被protected修饰，子类可以访问
  }

  def accessPrivate(): Unit ={
    //test02() 无法访问，报错
  }
}
