package practice.lzh.scala.learning.implicitDemo

/**
 * 使用隐式转换为类增加功能
 */
object MyImplicitConvert1 {

  def main(args: Array[String]): Unit = {
    implicit def addDelete(mySQL: MySQL):DataBase = {
      new DataBase
    }

    val mySQL = new MySQL
    mySQL.insert("aaa")
    mySQL.delete("aaa") //底层：addDelete$1(mySQL).delete(...)
  }

}

class DataBase {
  def delete(s:String):Int = {
    println("删除:"+s)
    1
  }
}

class MySQL {
  def insert(s:String):Int = {
    println("写入:"+s)
    1
  }
}
