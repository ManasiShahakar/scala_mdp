package Scala_concepts

import scala.io.StdIn._
  object Arrays {
    def main(args: Array[String]): Unit = {
      println("Enter the size of array which you need: ")
      var size: Int = readInt
      var arr = new Array[Int](size)
      println("Enter the values of Array")
      for (i <- 0 until (size)) {
        arr(i) = readInt
      }
      var arr1 = arr.sorted
      var min_sum = 0
      var sub_size =readLine("Enter the size of Sub Array: ").toInt
      for ( i <- 0 until sub_size){
        min_sum += arr1(i)
      }
      println("The min sum of the subarray is: "+min_sum)
    }

}
