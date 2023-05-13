import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HigherOrderFunctionTest extends AnyFlatSpec with Matchers {
    "A higher-order function" should "correctly apply the provided function to an integer" in {
    val result1 = MathFunctions.applyFunction(_ * 2, 5)
    val result2 = MathFunctions.applyFunction(_ + 10, 7)

        result1 shouldEqual 10
        result2 shouldEqual 17
    }

    "A function" should "correctly add a given number to another number" in {
        val addFive = (x: Int) => x + 5
        val result = MathFunctions.applyFunction(addFive, 10)

        result shouldEqual 15
    }


}