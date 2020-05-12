package practice.lzh.scala01.typeconvert

/**
 * 类型转换方法的使用
 * isInstanceOf[T]
 * asInstanceOf[T]
 * classOf[xxx.class]
 */
object TypeConvert {
  def main(args: Array[String]): Unit = {
    var father = new SupType
    var son = new SubType
    //Java方式，反射调用
    println(son.getClass.getName)
    //子类引用指向父类，向上转型，自动
    father = son
    father.printSupName()
    //向下转型
    var son2 = father.asInstanceOf[SubType]
    son2.printSupName()
    son2.printSubName()
    println("son2's type is SupType ? " + (if (son2.isInstanceOf[SupType]) "Yes" else "No"))
    println("son2's type is SubType ? " + (if (son2.isInstanceOf[SubType]) "Yes" else "No"))
  }
}

class SupType {
  private var name = "super"

  def printSupName(): Unit = {
    println("super name=" + this.name)
  }

  def supMethodOverride(): Unit ={
    println("sup...")
  }
}

class SubType extends SupType {
  private var subName = "sub"

  def printSubName(): Unit = {
    println("sub name=" + this.subName)
  }

  override def supMethodOverride(): Unit = {
    super.supMethodOverride()
    println("sub...")
  }
}
