package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 1))

  def parameterless(): Int = 442

  println(parameterless)
  println(parameterless())

  // When we need loops use recursion. Dont use loops, or imperative code with scala syntax.
  // Repeated, recursive function methods need return type, otherwise the can be skipped.
  // Best practise is to always mention return type of function.
  def repeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else aString + repeatedFunction(aString, n - 1)

  println(repeatedFunction("test", 3))

  def sideEffectFunction(): Unit = println("Test")

  sideEffectFunction()

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  println(aBigFunction(10))

  def greetingFunction(name: String, age: Int): String =
    s"Hi my name is $name and age is $age"

  println(greetingFunction("Neel", 25))

  def factorial(n: Int): Int =
    if (n == 0) 1
    else n * factorial(n - 1)

  println(factorial(5))

  def fibonnaci(n: Int): Int =
    if (n <= 2) 1
    else fibonnaci(n - 1) + fibonnaci(n - 2)

  println(fibonnaci(5))
}
