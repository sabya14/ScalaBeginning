package lectures.part2OOP

object OOPBasics extends App {
  val person = new Person("Neel", 25)
  person.greet("Sam")
}

class Person(name: String, val age: Int) {
  // Class parameters are not class members, to access there values, use val keyword.
  def greet(name: String): Unit = println(s"${this.name} says Hi $name")
  // Overloading
  def greet(): Unit = println(s"${this.name} says Hi")

  // multiple constructor, problem is auxiliary constructors can only use auxiliary constructors.
  // Better to use default parameters
  def this(name: String) =  this(name, 0)
}

