# Step 9
## Maps and Tuples in Scala (with TDD)
Welcome to Step 9 of "Scala in Steps"! Today, we're going to dive into two other crucial data structures in Scala: Maps and Tuples. Maps allow you to store key-value pairs, and tuples can hold multiple items of different types.
### Write Tests for Maps and Tuples
Let's start by writing tests for some basic operations on maps and tuples. In src/test/scala, create a new file named MapsTuplesTest.scala and add the following tests:
```scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MapsTuplesTest extends AnyFlatSpec with Matchers {
  "A Map" should "correctly store and retrieve key-value pairs" in {
    val map = Map("Apple" -> 1, "Banana" -> 2, "Cherry" -> 3)

    map.size shouldEqual 3
    map("Apple") shouldEqual 1
    map("Banana") shouldEqual 2
    map("Cherry") shouldEqual 3
    map.contains("Durian") shouldBe false
  }

  "A Tuple" should "correctly store and retrieve multiple items" in {
    val tuple = ("Apple", 1)

    tuple._1 shouldEqual "Apple"
    tuple._2 shouldEqual 1
  }
}
```
Now, run the tests. As with the previous collections, these tests should pass immediately, verifying the expected behavior of maps and tuples in Scala.
### Use Maps and Tuples in Practice
Now that we've tested some basic operations on maps and tuples, let's use them in practice. For example, we might use a map to associate each Person instance with an ID, and a tuple to store a pair of related items, such as a name and an age.