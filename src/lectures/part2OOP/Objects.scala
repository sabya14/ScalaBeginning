package lectures.part2OOP

object Objects extends App {

  object Person {
    // Class level functionality
    val N_EYES = 2
    // Factory methods
    def from(mother: Person, father: Person): Person = new Person("Bobbie")
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  println(Person.N_EYES)

  class Person(val name: String) {
    // Instance level functionality
  }

  // Scala object = singleton instance
  val mary = Person
  val john = Person
  println(mary == john)

  val mary1 = new Person("mary")
  val john1 = new Person(name = "john")
  val bobbie = Person.from(mary1, john1)
  val bobbie1 = Person(mary1, john1)

  // Scala applications = Scala object with
  //  def main(args: Array[String])": Unit - bcoz the have to be turned to JVM objects.
}
