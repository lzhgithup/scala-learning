package practice.lzh.scala01.renamedemo

/**
 * 将Java的HashMap中的数据全部存入到Scala的HashMap中
 *
 * 这里继承了App之后，就不需要再写入口函数main了
 */
object RenameDemo extends App {

  import java.util.{HashMap => JavaHashMap} //使用=>重命名类
  import collection.mutable.{HashMap => ScalaHashMap, _}

  val javaMap = new JavaHashMap[Int, String]() //scala中的泛型由[]指定
  javaMap.put(1, "one")
  javaMap.put(2, "two")
  javaMap.put(3, "three")
  javaMap.put(4, "four")
  println("javaMap:")
  javaMap.entrySet().forEach(println)
  val scalaMap = new ScalaHashMap[Int, String]()
  //javaMap.keySet().toArray()：将JavaHashMap中的key转为数组
  //key.asInstanceOf[Int]：将key转为Int类型
  //key.asInstanceOf[Int] -> javaMap.get(key)：这是scala中的KV结构表示，key -> value
  //+=是将key -> value拷贝到scalaMap中
//  for(key <- javaMap.keySet().toArray()){
//    scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
//  }
  javaMap.keySet().forEach(key => scalaMap += (key -> javaMap.get(key)))
  println("scalaMap:")
  //以一个空格为分隔符输出k -> v
  println(scalaMap.mkString(" "))
  //println(scalaMap)
}
