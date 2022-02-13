package Scala_concepts
import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Lists {
  def prime(a: Int): Int = {
    var c = 0
    for (i <- 1 to a) {
      if (a % i == 0) {
        c = c + 1
      }
    }
    if (c == 2) {
      a
    } else {
      0
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the size of list: ")
    var size = readInt()
    var num_list = new ListBuffer[Int]()
    var even_list = new ListBuffer[Int]()
    var odd_list = new ListBuffer[Int]()
    println("Enter the elements of List")
    for (i <- 0 until size) {
      num_list += readInt()
    }
    println(num_list)
    var max = num_list(0)
    for (i <- 0 until (size)) {
      if (num_list(i) > max) {
        max = num_list(i)
      }
    }
    println("The highest element in the list is: " + max)
    var prime_check = 0
    print("The prime factors of highest element are: ")
    for (i <- 1 to max) {
      if (max % i == 0) {
        prime_check = prime(i)
        if (prime_check > 0) {
          print(prime_check + " ")
        }
      }
    }

    for (i <- 0 until (size)) {
      if (num_list(i) % 2 == 0) {
        even_list += num_list(i)
      }
      else
        odd_list += num_list(i)
    }
    println("\nList of even numbers is: " + even_list)
    println("List of odd numbers is: \n" + odd_list)

    var r = 0
    var sum = 0
    var temp = 0

    for (i <- 0 until (size)) {
      if (num_list(i) > 9) {
        temp = num_list(i)
        while (num_list(i) > 0) {
          r = num_list(i) % 10
          sum = (sum * 10) + r
          num_list(i) /= 10
        }
        if (temp == sum)
          println("Element " +(i+1)+ " is a Palindrome number")
        else
          println("Element " +(i+1)+ " is not a Palindrome number")
        sum = 0
      }
      else
        println("Element " +(i+1)+  " of list is 1 digit number")
    }
  }


}
