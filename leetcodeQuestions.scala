

object leetcodeQuestions {
   def mySqrt(x: Int): Int = {
     def goodEnough(guess: Double, x: Double): Boolean =
        Math.abs(guess * guess - x) < 0.001
     def improve(guess: Double, x: Double): Double =
        (guess + x / guess) * 0.5
     def sqrtIter(guess: Double, x: Double): Double =
       if (goodEnough(guess, x)) guess
         else sqrtIter(improve(guess, x), x)
    sqrtIter(0.001, x).toInt
  }//sqrt of a num
  
  def findPermutation(s: String): Array[Int] = {
    def doFind(s: List[Char], stack: List[Int], nums: List[Int], output: List[Int]): List[Int] =
     s match {
      case 'D'::xs => doFind(xs, nums.head :: stack, nums.tail, output)
      case 'I'::xs =>
        doFind(xs, Nil, nums.tail, stack.reverse ++ List(nums.head) ++ output)
      case _ => stack.reverse ++ nums ++ output
    }
    doFind(s.toList, Nil, (1 to s.length + 1).toList, Nil).reverse.toArray
  }//https://leetcode.com/problems/find-permutation/description/
   
   def betterSum(n: Int, sum: Int): Int =
      if (n == 0) sum
      else betterSum(n - 1, n + sum)
  // sum of 1 to n

  def isUgly(num: Int): Boolean = {
      if (num <= 0) false
      else if (num == 1) true
      else if (num % 2 == 0) isUgly(num / 2)
      else if (num % 3 == 0) isUgly(num / 3)
      else if (num % 5 == 0) isUgly(num / 5)
      else false
  }//https://leetcode.com/problems/ugly-number/description/
  
  def main(args: Array[String]) {
       println(mySqrt(36))
       
    }
}//

