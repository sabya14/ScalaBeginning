package lectures.part1basics

import com.sun.source.tree.WhileLoopTree

object Expressions extends App {
  val x = 1 + 2

  // Instructions -> Tell computer to do something, like print etc.. normal in python or java
  // Expression -> Always tell computer to compute a value, in scala.. this is the main thing
  val aCondition = true
  // If expression returns a value, rather than setting a value like an instruction
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // Dont write loops in scala, breaks the crux of functional programming
  // Everything in scala is expression, few exceptions.
  var i = 10
  val aWhile = while (i > 0) {
    println(i)
    i -= 1
  }
  var aVariable = 3
  val aWeirdValue = aVariable = 3 // Reassigning a variable a scala is side affect, and it returns unit, unit == void
  println(aWeirdValue)

  val aCodeBlock: String = {
    // The scope of x and y is inside this code block only.
    val y = 2
    val x = 5
    if (x > y) "Hello x is greater" else "X is less"
  }

  val someValue = {
    if (true) 5 else 2
    10 // The last value is the value of the code block
  }
  println(someValue)
}
