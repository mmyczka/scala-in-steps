import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MathFunctionsTest extends AnyFlatSpec with Matchers {

  "addition function" should "return the correct sum" in {
        val result = MathFunctions.add(3, 4)
        result shouldEqual 7
    }

    "area function" should "return the correct area" in { 
    	val result = MathFunctions.area(5.0, 3.0) 
    	result shouldEqual 15.0 
    }

    "total cost function" should "return the correct cost" in {
    	val result1 = MathFunctions.totalCost(100.0) 
    	val result2 = MathFunctions.totalCost(100.0, 0.2)

    	result1 shouldEqual 110.0 
    	result2 shouldEqual 120.0 
    }

    "factorial function" should "return the correct factorial" in { 
    	val result = MathFunctions.factorial(5) 
    	result shouldEqual 120 
    }

    "tail-recursive factorial function" should "return the correct factorial" in {
        val result = MathFunctions.tailFactorial(5)
        result shouldEqual 120
    }

    
}
