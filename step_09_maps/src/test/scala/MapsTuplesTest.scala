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