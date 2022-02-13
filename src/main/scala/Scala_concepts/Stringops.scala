package Scala_concepts
import scala.io.StdIn._
import scala.util.Random
  object Stringops {
    def main(args: Array[String]): Unit = {
      var count = 0
      var n1 = 1
      var v_count = 0
      var c_count = 0
      var input: String = readLine("Enter a sentence: ")
      var s1 = readLine("Enter the first word: ")
      var s2 = readLine("Enter the second word: ")
      while (n1 != 0) {
        println("Enter your choice: ")
        var n = readInt()
        n match {
          case 1 =>
            val b = input.split(" ")
            for (i <- b) {
              count += 1
            }
            println("The number of words in the given sentence are: " + count)
          case 2 =>
            if (input == input.reverse) {
              println("The given word is a palindrome")
            }
            else {
              println("The given word is not a palindrome")
            }
          case 3 =>
            var spaces = 0
            var m = 0
            for (m <- 0 until input.length()) {
              var l = input.toLowerCase()
              var ch = l.charAt(m)
              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v_count = v_count + 1
              }
              else {
                if (ch == ' ') {
                }
                else {
                  c_count += 1
                }
              }
            }
            println("The number of vowels in the given string are: " + v_count)
            println("The number of consonants in the given string are: " + c_count)
          case 4 =>
            println("The total no. of letters in the given string are: " + (v_count + c_count))
          case 5 =>
            var tf = input.contains("the")
            println("The given string contains THE or not: " + tf)
          case 6 =>
            println("Enter the number to check the char at that place: ")
            var num = readInt
            if (num < input.length){
              var cn = input.charAt(num - 1)
              if (cn == ' ') {
                println("The required position of string contains space")
              }
              else {

                println("The character is :" + cn)
              }
            }
            else {
              println("The entered number is out of limit")
            }

          case 7 =>

            println("The entered two words are exactly same: " + s1.equals(s2))
            println("The entered two words are same :" + s1.equalsIgnoreCase(s2))

          case 8 =>
            var s3 = s1.compareTo(s2)
            if (s3 != 0) {
              println("The concatenated string is: " + s1.concat(s2))
            }
          case 9 =>
            var s4 = s1.charAt(s1.length - 1).toUpper
            if (s4 == 'A' || s4 == 'E' || s4 == 'I' || s4 == 'O' || s4 == 'U') {
              println("The word ends with a vowel")
            }
            else {
              println("The word doesn't end with a vowel")
            }
          case 10 =>
            var start_Index = -1
            var end_Index = -1
            for( i <- 0 until  s1.length ){
              var j = s1.charAt(i).toUpper
              if(j == 'A'|| j == 'E'|| j =='I'|| j == 'O'|| j == 'U'||
                j == 'a'|| j == 'e'|| j =='i'|| j == 'o'|| j == 'u') {
                if (start_Index == -1){
                  start_Index =i
                }
                end_Index = i
              }
            }
            if(start_Index == -1)
              println("Vowel is not present")
            else
              println("the position of the 1st vowel is "+ (1+start_Index)+ " and last vowel is "
                + (end_Index+1) + " in the word")

          case 11 =>
            var q = s1.toUpperCase()
            var new_word = ""
            for (i <- 0 until q.length) {
              var ms: Char = q.charAt(i)
              if (ms == 'A' || ms == 'E' || ms == 'I' || ms == 'O' || ms == 'U') {
                new_word = new_word + '*'
              }
              else {
                new_word = new_word + ms
              }
            }
            println("Word after replacing vowels is: " + new_word)

          case 12 =>
            var num1, num2 = Random.between(0, s2.length)
            if (num1 > num2) {
              val sub_string = s2.substring(num2, num1)
              println("The random numbers are: " + num2 + " and " + num1)
              println(sub_string)
            }
            else {
              val sub_string = s2.substring(num1, num2)
              println("The random numbers are: " + num1 + " and " + num2)
              println(sub_string)
            }

          case 13 =>
            println("Exit")
            n1 = 0
        }
      }
    }


}
