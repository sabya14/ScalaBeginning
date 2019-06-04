package lectures.part2OOP

object MethodNotations extends App {
  class Person(val name:String, favouriteMovie: String) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! :String = s"${this.name} is awesome"

    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"
  }

  val john = new Person("john", "inception")
  println(john.likes("inception"))
  println(john likes "inception") // infix notation or operator notation
  // Works only with method single parameter

  val tom = new Person("tom", "interstellar")
  println(john hangOutWith tom)

  println(1+2)
  println(1.+(2)) // All operators are methods

  //prefix notation
  val x = -1
  // Unary notations
  val y = 1.unary_-
  println(!john)

  // Apply
  println(tom.apply())
  println(tom())
}
