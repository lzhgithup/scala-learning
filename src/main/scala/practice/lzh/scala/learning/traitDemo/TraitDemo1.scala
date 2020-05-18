package practice.lzh.scala.learning.traitDemo

/**
 * 叠加特质，用栈的思想去理解执行流程(对象的构建顺序、方法的执行顺序)
 */
object TraitDemo1 {
  def main(args: Array[String]): Unit = {
    //先混入了特质DB，发现DB的父特质未实例化，所以去实例化Data，当实例化Data时，发现Data的父特质Operate未实例化，那么就
    // 会去实例化Operate，之后混入了特质File，发现父特质Data被实例化过了，那么不会再去执行一遍
    val mysql = new Mysql with DB with File
    println(mysql)
    println("=============")
    //同理
    val mysql1 = new Mysql with File with DB
    println(mysql1)
    println("=============")
    //当执行一个动态混入对象的方法时,执行顺序是从右到左
    mysql.insert(888)
  }
}

trait Operate {
  println("operate ...")

  def insert(id:Int)
}

trait Data extends Operate {
  println("data ...")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB extends Data {
  println("db ...")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File extends Data {
  println("file ...")

  override def insert(id: Int): Unit = {
    println("向文件")
    //这里的super指向的不一定是父特质Data的实例，只有当动态混入对象从右向左执行时，找不到动态混入的特质了，这里的super才指向的是File的父特质
    super.insert(id)
  }
}

class Mysql {}