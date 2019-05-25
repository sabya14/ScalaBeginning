package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  def tailRecursiveFact(n: Int): BigInt = {
    @tailrec
    def recursiveUtil(n: Int, accumalator: BigInt): BigInt =
      if (n <= 1) accumalator
      else recursiveUtil(n - 1, n * accumalator)

    recursiveUtil(n, 1)
  }

  def stringConcat(n: Int, string: String): String = {
    @tailrec
    def recursiveUtil(n: Int, string: String, returnString: String): String =
      if (n == 0) returnString
      else recursiveUtil(n - 1, string, returnString.concat(string))
    recursiveUtil(n, string, "")
  }

  println(stringConcat(10, "test"))

  def fibonacci(n: Int): Int = {
    def recursive_fib(i:Int, last: Int, nextToLast: Int): Int =
      if (i>=n) last
      else recursive_fib(i+1, last+nextToLast, last)

    if (n<=2) 1
    recursive_fib(2, 1, 1)
  }
  println(fibonacci(8))
}
