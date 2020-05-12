/**
 *
 * 代码说明：package practice.lzh.scala01.packagedemo{}表示我们创建了包practice.lzh.scala01.packagedemo
 * ，而在{}中，我们可以继续写子包 scalaPackageTest，还可以写class类、trait特质、object。
 *
 * 即：在scala中，支持在一个文件中，同时创建多个包，以及给各个包创建类、特质、object。
 *
 *
 */
package practice.lzh.scala01.packagedemo{

  package scalaPackageTest { //practice.lzh.scala01.packagedemo.scalaPackageTest

    class Person { //表示在包practice.lzh.scala01.packagedemo.scalaPackageTest中创建了Person类

      var name:String= "test01"

      def play(str:String): Unit ={
        println(this.name+"..."+str)
      }
    }

    object Test001 {
      def main(args: Array[String]): Unit = {
        println("Test001~~~~~~~~")
      }
    }

  }

  package scalaPackageTest01{
    object Test002{
      def main(args: Array[String]): Unit = {
        println("Test002~~~~~~~~~")
      }
    }
  }
}


