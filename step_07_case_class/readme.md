# Step 7
## Pattern Matching and Case Classes
Welcome to Step 7 of "Scala in Steps"! Today, we're going to delve into pattern matching and case classes in Scala. Pattern matching allows you to match on the structure of data, not just its value, while case classes are regular classes that export their constructor parameters and have natural equality semantics.
### Case Class
In Scala, case classes are a special kind of class that are good for modeling immutable data. They have several handy features that regular classes do not have:
1. Immutability: All fields in a case class are immutable, meaning that they can't be changed after they're set. This aligns with the functional programming paradigm, which prefers immutable data.
2. Constructor Parameters: The parameters of a case class constructor are public and can be accessed directly. For instance, if you have a case class Person(name: String, age: Int), you can access the name and age fields directly.
3. Equality Checks: Case classes have a built-in implementation of the equals method, which allows you to compare two instances of a case class for structural equality, not referential equality. That is, two instances are equal if their corresponding fields are equal.
4. Pattern Matching Support: Case classes can be used in pattern matching expressions, which we'll explain next.
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
### Pattern Matching

Pattern matching is a powerful feature in Scala that allows you to match on the structure of data, not just its value. It's similar to a switch statement in other languages, but it's more powerful because it can match on complex structures and has support for matching on types and conditions.
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


In summary, case classes and pattern matching are two key features in Scala that make it easy to model and operate on complex data structures. They are particularly useful in functional programming, where you often work with immutable data and transformations of that data.