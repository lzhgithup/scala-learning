package practice.lzh.scala.learning.collectionOp

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * 集合操作练习
 */
object MyCollectionOp {
  def main(args: Array[String]): Unit = {
    q1
    q2
  }

  /**
   * 题1：将一个字符串中的每个字符通过foldLeft放入到ArrayBuffer中
   */
  def q1(): Unit = {
    println("====q1====")
    val s = "AAAAAAADDDDDDDDTTTTTTvbbbbb"
    val arr = ArrayBuffer[Char]()
    val arr1 = s.foldLeft(arr)(putArr)
    println(arr1)
  }

  def putArr(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  /**
   * 题2：统计一句话中，各个字符出现的次数，并保存在一个Map中
   */
  def q2(): Unit = {
    println("====q2====")
    val s = "AAAAAAEEEEEGETKGKEIHGJKDFSAKUW33IO5655523RF"
    val map1 = s.foldLeft(mutable.Map[Char, Int]())(count1)
    println(map1)

    val map2 = s.foldLeft(mutable.Map[Char, Int]())(count2)
    println(map2)
  }

  def count1(map: mutable.Map[Char, Int], c: Char) = {
    if (map.contains(c)) {
      map(c) = map(c) + 1
    } else {
      map += (c -> 1)
    }
    map
  }

  /**
   * 或者
   */
  def count2(map: mutable.Map[Char, Int], c: Char) = {
    map.put(c, map.getOrElse(c, 0) + 1)
    //map += (c -> (map.getOrElse(c, 0) + 1))
    map
  }


  /**
   * 题3：使用映射统计List中单词出现的次数，并按出现次数排序
   * val lines = List("you are nice","you are stupid","we are family")
   */
  def q3(): Unit = {

  }


}
