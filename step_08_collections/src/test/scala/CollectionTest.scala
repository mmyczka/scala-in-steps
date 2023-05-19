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