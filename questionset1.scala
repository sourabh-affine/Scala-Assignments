

object questionset1 {
  
    def eligibleToVote() : Unit = {
        print("enter age!")
        val age : Int =scala.io.StdIn.readInt()
        if (age>=18) print("Go to Vote")
        else print("Dont Vote Yet")
    }//question 1
    
    def evenOrOdd() : Unit = {
        println("enter number!")
        val num : Int =scala.io.StdIn.readInt()
        if (num%2==0) println("Even") else println("Odd")
    }//question 2
    
    def divisibleby7() : Unit = {
        println("enter number!")
        val num : Int =scala.io.StdIn.readInt()
        if (num%7==0) println("Divisible") else println("Non-Divisible")
    }//question 3
    def helloOrBye() : Unit ={
        println("enter number!")
        val num : Int =scala.io.StdIn.readInt()
        if (num%5==0) println("Hello") else println("Bye")
    }//question 4
    def electricityBill() : Unit ={
        println("enter the units of electricity consumed!")
        val units : Int =scala.io.StdIn.readInt()
        val bill = { 
        if (units>200) (units-200)*10+500
        else if (units>100 && units <=200) (units-100)*5
        else 0
        }
        println(s"your total bill is $bill")
    }//question 5
    
    def lastDigit() : Unit={
        println("enter number!")
        val num : Int =scala.io.StdIn.readInt()
        println(s"last digit of your number is ${num%10}") 
    }//question 6
    
    def lastDigitBy3() : Unit={
        println("enter number!")
        val num : Int =scala.io.StdIn.readInt()
        if ((num%10)%3==0) println("Last Digit is divisible by 3") else println("Last Digit is NOT divisible by 3")
    }//question 7
    
    def gradeByPercentage() : Unit ={
        println("enter the percentage of marks!")
        val percent : Int =scala.io.StdIn.readInt()
        val grade = { 
        if (percent>90) 'A'
        else if (percent<=90 && percent>80) 'B'
        else if (percent<=80 && percent>60) 'C'
        else if (percent<60) 'D'
        }
        println(s"your grade is $grade")
    }//question 8
    
    def roadTaxCalc() : Unit ={
        println("enter the price of the vehicle!")
        val price : Int =scala.io.StdIn.readInt()
        val tax = { 
        if (price>100000) (price*0.15)
        else if (price<=100000 && price> 50000) (price*0.10)
        else if (price<=50000) (price*0.05)
        }
        println(s"your total road tax is $tax")
    }//question 9
    
    def leapYear() : Unit={
        println("enter year!")
        val year : Int =scala.io.StdIn.readInt()
        if (year%400==0 || (year%4==0 && year%100!=0)) println("Leap Year") 
        else println("Not a Leap Year")
    }//question 10
    
    def main(args: Array[String]) {
        
        leapYear()
    }
}




























