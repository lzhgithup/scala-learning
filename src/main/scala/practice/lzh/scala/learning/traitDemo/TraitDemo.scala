package practice.lzh.scala.learning.traitDemo

/**
 * 动态混入
 * 在不修改类中定义的基础上，让它们使用trait中的方法
 */
object TraitDemo {
  def main(args: Array[String]): Unit = {
    //对普通类的功能进行扩展
    val op = new OracleDB with Operate3
    op.insert(66)

    //还可以对抽象类的功能进行扩展
    val mysql = new MySQLDB with Operate3
    mysql.insert(88)

    //若抽象类中有未实现的方法
    val sqlServer = new SqlServer with Operate3 {
      override def query(): Unit = {
        println("sql server 查询...")
      }
    }
    sqlServer.insert(999)
    sqlServer.query()
  }
}

trait Operate3 {
  def insert(id:Int):Unit = {
    println("插入数据 = " + id)
  }
}

class OracleDB {
}

abstract class MySQLDB {
}

abstract class SqlServer {
  def query()
}
