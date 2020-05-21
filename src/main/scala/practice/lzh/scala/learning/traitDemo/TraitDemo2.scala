package practice.lzh.scala.learning.traitDemo

/**
 * 特质中重写抽象方法特例
 * abstract override 抽象重写
 */
object TraitDemo2 {
  def main(args: Array[String]): Unit = {
    val f = new File1 with Data2 with Data1
    f.insert(100)

    //只混入Data1，则编译器报错
    //val w = new File1 with Data1
  }
}

trait Op {
  def insert(id:Int)
}

trait Data1 extends Op {
  //注意是abstract override，表明该方法确实重写了父类的抽象方法，但仍然是一个抽象方法
  //因为没有完全实现，需要其他trait继续实现，通过混入顺序实现
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
