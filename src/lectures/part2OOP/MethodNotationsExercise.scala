package lectures.part2OOP

object MethodNotationsExercise extends App {

  class Person(val name: String, val age: Int = 0) {
    def +(str: String): Person = new Person(name = s"${this.name} ($str)")

    def unary_+ : Person = new Person(name = this.name, age = this.age + 1)

    def learns(str: String): String = s"$name learns $str"

    def learnScala: String = this learns "Scala"

    def apply(number: Int): String = s"$name watch the movie Interstellar $number times"
  }

  var john = new Person("John", 10)
  var newJohn = +john
  println(john learnScala)
  println(newJohn.age)
  println((john + "Rocktar") (2))

}
