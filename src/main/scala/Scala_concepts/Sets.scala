package Scala_concepts

  import  scala.collection.mutable._
  import scala.io.StdIn._
  object Sets {
    def main(args: Array[String]) {
      var set1 : Set[String] = Set()
      var set2 :Set[String] = Set()
      var s1 = readLine("Enter the size of set for basket 1: ").toInt
      var s2 = readLine("Enter the size of set for basket 2: ").toInt
      if (s1 > 10) {
        println("The size entered of basket1 is above the limit")
      }
      if (s2 > 10) {
        println("The size entered of basket2 is above the limit")
      }
      if (s1 <= 10) {
        for (i <- 0 until s1) {
          set1.add(readLine("Enter the element which needs to be added in basket1: "))
        }
        println("Basket 1 contains: "+set1)
      }
      if (s2 <= 10) {
        for (i <- 0 until s2) {
          set2.add(readLine("Enter the element which needs to be added in basket2: "))
        }
      }
      println("Basket 2 contains: "+set2)
      var set3 = set1.intersect(set2)
      println("The common items in both the baskets are: "+set3)
      var set4 = set1.diff(set3)
      println("The unique which only basket1 has are: "+set4)
      println("The total final elements in both the baskets are: "+set1.concat(set2))

    }


}
