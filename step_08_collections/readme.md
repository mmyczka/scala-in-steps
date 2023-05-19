# Step 8
## Collections in Scala: Lists, Arrays, and Sets
Welcome to Step 8 of "Scala in Steps"! Today, we will explore three fundamental data structures in Scala: Lists, Arrays, and Sets.
### Write Tests for Collections
Let's start by writing tests for some basic operations on lists, arrays, and sets. In src/test/scala, create a new file named CollectionsTest.scala and add the following tests:
```scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CollectionsTest extends AnyFlatSpec with Matchers {
  "A List" should "have correct size and elements" in {
    val list = List(1, 2, 3)
    list.size shouldEqual 3
    list.head shouldEqual 1
    list(1) shouldEqual 2
    list.last shouldEqual 3
  }

  "An Array" should "have correct size and elements" in {
    val array = Array(1, 2, 3)
    array.length shouldEqual 3
    array(0) shouldEqual 1
    array(1) shouldEqual 2
    array(2) shouldEqual 3
  }

  "A Set" should "contain no duplicates" in {
    val set = Set(1, 2, 2, 3, 3, 3)
    set.size shouldEqual 3
    set.contains(1) shouldBe true
    set.contains(2) shouldBe true
    set.contains(3) shouldBe true
    set.contains(4) shouldBe false
  }
}
```
Now, run the tests. As we're using built-in Scala collections, these tests should pass immediately, verifying the expected behavior of these collections.
### Use Collections in Practice
Now that we've tested some basic operations on lists, arrays, and sets, let's use them in practice. For instance, we could use a list to store multiple Person instances, an array to store different ages, and a set to store unique names.
You're encouraged to write tests for any complex operations you perform on these collections.


By using Scala's powerful and versatile collections, you can efficiently manage and manipulate data in your programs. As we continue to explore Scala, we will encounter more advanced collection types and learn how to use them effectively in conjunction with other Scala features.