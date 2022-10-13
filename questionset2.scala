import scala.io.StdIn._

object questionset2 {
  
  def zooCheck() : Unit ={
    println("Enter The string to be zoochecked")
    val str= readLine()
    val zcount=str.lastIndexOf(str.charAt(0))+1
    val ocount= str.length()-zcount
    if (zcount*2==ocount)
      println("ZOO Like")
    else
      println("Not ZOO Like ")
  }
  def arrayLastDivisibleBy10(): Unit ={
    println("Enter The Length of the array")
    val length= readLine()
    println("Enter the numbers of the array seperated by Space")
    val numberstr =readLine()
    val numbers: Array[String] = numberstr.split(" ")
    val lastDigits: Array[Char] =numbers.map(x => x.charAt(x.length-1))
    val finalNum= lastDigits.mkString("").toInt
    if (finalNum%10==0) println("Yes") else println("No")  
  }
  
   def aSpecialNumber(): Unit= {
     println("Enter The number of the test cases")
     val length= readLine()
     println("Enter the numbers for testing seperated by Space")
     val numberstr =readLine()
     var specialNumber : Int =0
     var iterator : Int =0
     val numbers = numberstr.split(" ")
     for(i <- numbers) {
       iterator=i.toInt
       specialNumber=sumDigit(i.toInt)
       while(specialNumber%4!=0) {
         iterator+=1
         specialNumber=sumDigit(iterator)
      }
      println(iterator)
   }
     }
   
   def sumDigit(n : Int) :Int ={
    return if (n == 0 ) 0 else n%10 + sumDigit(n/10)
   }
   
   def roomCalc(): Unit ={
    println("Enter The Number of test cases of the array")
    val length= readLine().toInt
    var answers = new Array[Int](length)
    for (i<- 0 to length-1){
      val numberstr =readLine()
      val numbers = numberstr.split(" ").map(x=>x.toInt)
      var broom ={if (numbers(0)% numbers(2)==0) 0 else 1 }+(numbers(0)/numbers(2))
      var groom = {if (numbers(1)% numbers(2)==0) 0 else 1} +(numbers(1)/ numbers(2))
      answers(i) = broom+groom
    }
    answers.foreach(println)
   
  }
  
  def main(args: Array[String]) {
       roomCalc()
    }
}







