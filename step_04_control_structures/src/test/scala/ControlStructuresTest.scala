import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ControlStructuresTest extends AnyFlatSpec with Matchers {

    "even and odd numbers" should "be identified correctly" in {
        val number = 10
        val result = if (number % 2 == 0) "even" else "odd"
        result shouldEqual "even"
    }

    "number to word mapping" should "be correct" in {
        val number = 3
        val word = number match {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case _ => "unknown"
        }
        word shouldEqual "three"
    }

    "sum of numbers from 1 to 5" should "equal 15" in {
        var sum = 0
        var i = 1
        while (i <= 5) {
            sum += i
            i += 1
        }
        sum shouldEqual 15
    }

    "even numbers from a list" should "be extracted correctly" in {
        val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val evens = for {
            number <- numbers if number % 2 == 0
        } yield number
        evens shouldEqual List(2, 4, 6, 8)
    }

}
