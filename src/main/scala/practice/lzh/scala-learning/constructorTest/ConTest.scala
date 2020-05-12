package practice.lzh.scala01.constructorTest

object ConTest {
  def main(args: Array[String]): Unit = {
    val dog = new Dog("小黄",5)
    println("name=" + dog.name)
  }
}

/**
 * 在辅助构造器中，第一行代码必须间接或直接调用类的主构造器，这时因为只有
 * 主构造器才能访问该类的父类的主构造器，否则无法实现继承的功能
 * @param inName
 * @param inAge
 */
class Dog(inName:String,inAge:Int){
  var name:String = inName
  var age:Int = inAge

  def this(){
    this("ddd",12)
    this.name = "d"
    this.age = 5
  }
}
