package Scala_concepts

import scala.io.StdIn._
import scala.util.Random
object Employee_wage {
    def main(args: Array[String])
    {
      var emp_name =  readLine("Enter employee name:")
      var r = new Random
      var days = 0
      var emp_wage = 0
      var full_time =0
      var part_time =0
      var i = 1

      while(i < 25)
      {
        if (r.nextBoolean() == true)
        {
          days += 1
          if (r.nextBoolean() == true){
            println("-----------------------------------")
            println("For day "+ i )
            println("Employment type is: " +"Full Time")
            println("Employee attendance status: Present")
            emp_wage += 8 * 100
            full_time += 1
            println("Daily Wage: 800")
          }
          else
          {
            println("-----------------------------------")
            println("For day "+ i )
            println("Employment type is: " +"Part Time")
            println("Employee attendance status: Present")
            emp_wage += 4 * 100
            part_time += 1
            println("Daily Wage: 400")
          }
        }
        else{
          println("-----------------------------------")
          println("For day "+ i    )
          println("Employee attendance status: Absent")
          println("Daily Wage: 0")
        }
        i = i+1
      }
      println("----------------------------------------")
      print("Employee name: " + emp_name+ "\n"+"Type of Employment as Full time: "+ full_time+
        "\n"+"Type of Employment as Part time: "+ part_time+ "\n"
        +"Attendance: " + days+ " days" +"\n" +"Employee wage: " + emp_wage )
    }



}
