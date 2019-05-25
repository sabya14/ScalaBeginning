package lectures.part1basics

object CBVvsCBR extends App {
  def calledByValue(n: Long): Unit = {
    println("by value: " + n)
    println("by value: " + n)
  }

  def calledByName(n: => Long): Unit = {
    println("by name: " + n)
    println("by name: " + n)
  }
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
