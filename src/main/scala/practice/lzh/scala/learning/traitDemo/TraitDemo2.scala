package practice.lzh.scala.learning.traitDemo

/**
 * 特质中重写抽象方法特例
 * abstract override ，在我看来，就是半抽象
 */
object TraitDemo2 {
  def main(args: Array[String]): Unit = {
    val f = new File1 with Data2 with Data1
    f.insert(100)
  }
}

trait Op {
  def insert(id:Int)
}

trait Data1 extends Op {
  abstract override def insert(id:Int): Unit = {
    println("Data1 插入 ...")
    //利用动态混入特质来调用这个insert
    super.insert(id)
  }
}

trait Data2 extends Op {
  override def insert(id: Int): Unit = {
    println("Data2 插入 ...")
  }
}

class File1 {}
