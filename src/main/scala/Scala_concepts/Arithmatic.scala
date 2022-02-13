package Scala_concepts
import scala.io.StdIn._
object Arithmatic {
    def main(args: Array[String]) {
      println("Arithmetic operations ")
      println("Enter the first number:")
      var m1: Int = readInt()
      println("Enter the second number:")
      var m2: Int = readInt()
      println("Addition= " + (m1+m2))
      println("Subtraction= " + (m2-m1))
      println("Multiplication= " + (m1*m2))
      println("Division= " + (m2/m1))
      if ((m1*m2) % 2 ==0){
        println("The addition of two numbers is even")
      }
      else {
        println("The addition of two numbers is odd")
      }
    }

}
