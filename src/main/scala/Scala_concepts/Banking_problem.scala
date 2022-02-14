package Scala_concepts
import scala.io.StdIn._
import scala.collection.mutable._
class  TestQueue() {
  var customer_queue = Queue[String]()

  def Enqueue(item: String): Unit = {
    customer_queue.enqueue(item)
  }

  def Dequeue(): Unit = {
    var dequeue_customer =customer_queue.dequeue()
    println("Welcome "+ dequeue_customer)
    var n =1
    var (initial_bal,withdraw,deposit) =(0,0,0)
    var (total_deposit,total_withdraw) =(0,0)
    while(n!=0){
      println("Enter your choice")
      var choice = readLine("1-Deposit: \n2-Withdraw: \n3-Check Balance: \n4-Exit: ").toInt
      choice match {
        case 1 =>
          deposit = readLine("Enter the amount to deposit: ").toInt
          total_deposit = total_deposit + deposit
          initial_bal += deposit
          println("Account balance is: "+ initial_bal)

        case 2 =>
          withdraw = readLine("Enter the amount to withdraw: ").toInt
          if (initial_bal <= 0) {
            println("Insufficient Funds")
          }
          else if (withdraw > initial_bal) {
            println("Insufficient Funds")
          }
          else {
            initial_bal -= withdraw
            total_withdraw = total_withdraw + withdraw
            println("Balance is: "+ initial_bal)
          }
        case 3 =>
          println("Account balance of customer " + dequeue_customer +" is: "+ initial_bal + "\n" +
            "Amount withdrawn "+total_withdraw + "\n" +
            "Amount Deposited "+total_deposit)
        case 4 =>

          println("Thank you for visiting our bank: "+dequeue_customer)
          println("-----------------------------------------------------")

          n=0
      }
    }
  }
  def Empty(): Unit = {
    var emp = customer_queue.isEmpty
    if (emp == true)
      println("Queue is Empty")
    else
      println("Queue is not Empty")
  }

  def display(): Unit = {
    customer_queue.foreach((element: String) => print(element + " "))
  }

  def Size(): Unit = {
    var size = customer_queue.size
    println("Size of queue is: " + size)
  }
}

object TestBank{
  def main(args:Array[String]): Unit ={
    var person = new TestQueue()
    var n=1
    var n2= 1
    var name = ""
    println("Enter the number of customer in the bank: ")
    var num = readInt()
    println("Enter the names of the customer: ")
    while (n2 <= num ){
      var name = readLine()
      person.Enqueue(name)
      n2 += 1
    }
    print("The customers standing is queue are: ")
    person.display()
    println(" ")
    while(n!=0){
      println("Welcome to bank. \nEnter your choice")
      var check = readLine("1-Go to Counter and exit from queue \n2-Check if queue is Empty \n3-Check the size of queue\n4-Exit:\n ").toInt
      check match {
        case 1 =>
          person.Dequeue()
        case 2 =>
          person.Empty()
        case 3 =>
          person.Size()
        case 4 =>
          n=0
          System.exit(0)
      }
    }
  }
}