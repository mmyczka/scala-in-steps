import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BasicOperationsTest extends AnyFlatSpec with Matchers {
    "addition 2 and 3" should "be 5" in {
        val result = 2 + 3
        result shouldEqual 5
    }
  
}
