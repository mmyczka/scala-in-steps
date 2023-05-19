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

  "A match expression" should "correctly match on Person case class" in {
    val person = Person("John Smith", 25)

    val greeting = person match {
      case Person(name, _) => s"Hello, $name"
    }

    greeting shouldEqual "Hello, John Smith"
  }
  
}