package lectures.part1basics

object ValuesVariablesTypes extends App {
  val firstVariable: Int = 3
  println(firstVariable)

  // Val cant be reassigned, they are immutable
  // Compiler infer types
  val secondVariable = 10
  println(secondVariable)
  val aFloat: Float = 12.04f

  // Variables are mutable, the bring in side effects
  var aVariable: Int = 4
  println(aVariable)

}
