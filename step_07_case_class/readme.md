# Step 7
## Pattern Matching and Case Classes
Welcome to Step 7 of "Scala in Steps"! Today, we're going to delve into pattern matching and case classes in Scala. Pattern matching allows you to match on the structure of data, not just its value, while case classes are regular classes that export their constructor parameters and have natural equality semantics.
### Write Tests for a Case Class
We'll start by writing tests for a simple Person case class. In src/test/scala, create a new file named PersonTest.scala and add the following tests:
```scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonTest extends AnyFlatSpec with Matchers {
  "A Person" should "be correctly created with name and age" in {
    val person = Person("John Smith", 25)
    person.name shouldEqual "John Smith"
    person.age shouldEqual 25
  }
  
  it should "have natural equality semantics" in {
    val person1 = Person("John Smith", 25)
    val person2 = Person("John Smith", 25)
    person1 shouldEqual person2
  }
}
```
Now, run the tests to see them fail initially, as we haven't yet implemented the Person case class.
### Implement Person Case Class
In src/main/scala, create a new file named Person.scala and add the following case class definition:
```scala
case class Person(name: String, age: Int)
```
### Write Tests for Pattern Matching
Next, we'll write tests for pattern matching on the Person case class. Add the following test in PersonTest.scala:
```scala
"A match expression" should "correctly match on Person case class" in {
val person = Person("John Smith", 25)

val greeting = person match {
case Person(name, _) => s"Hello, $name"
}

greeting shouldEqual "Hello, John Smith"
}
```
### Rerun Tests
Finally, rerun the tests. This time, they should pass, as we've correctly implemented the case class and pattern matching.