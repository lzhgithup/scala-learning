package practice.lzh.scala.learning.nestedClass

/**
 * 类型投影
 * 由于在Scala中，创建内部类对象时，是与外部类对象绑定的，所以需要类型投影来解决这个问题
 */
class MyTypeProjection {

  class MyTypeProjectionInner(s: String) {

    var name: String = s

    def info(param: MyTypeProjectionInner): Unit = {
      println(this.name + ":" + param.name)
    }

    /**
     * 类型投影，接触外部类实例和内部类实例的绑定关系
     * 语法：外部类#内部类
     * @param param
     */
    def info2(param: MyTypeProjection#MyTypeProjectionInner): Unit = {
      println(this.name + ":" + param.name)
    }

  }

}

object MyTypeProjection {

  def main(params: Array[String]): Unit = {
    val m1 = new MyTypeProjection
    val m2 = new MyTypeProjection
    val i1 = new m1.MyTypeProjectionInner("小明")
    val i2 = new m1.MyTypeProjectionInner("小花")
    val i3 = new m2.MyTypeProjectionInner("小刚")
    i1.info(i1)
    i1.info(i2)
    //i1.info(i3) 传入i3会报错，因为i1与外部类m1绑定，只能传入使用m1创建的内部类对象
    i1.info2(i3)
  }
}
