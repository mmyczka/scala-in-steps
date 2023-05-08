import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BasicOperationsTest extends AnyFlatSpec with Matchers {
    "addition 2 and 3" should "be 5" in {
        val result = 2 + 3
        result shouldEqual 5
    }

    "immutable variable" should "not be reassigned" in{
        val x = 10
        //x = 15 If you uncomment this line it should throw a compile-time error
        x should not equal 15
    }

    "data types" should "be correctly assigned" in {
        val intValue: Int = 42
        val doubleValue: Double = 3.14
        val booleanValue: Boolean = true
        val charValue: Char = 'A'
        val stringValue: String = "Hello, Scala!"

        intValue shouldEqual 42
        doubleValue shouldEqual 3.14
        booleanValue shouldBe true
        charValue shouldEqual 'A'
        stringValue shouldEqual "Hello, Scala!"
    }

    "expressions" should "evaluate correctly" in {
        val sum = 10 + 5
        val product = 10 * 5
        val quotient = 10 / 5
        val difference = 10 - 5 
        val isGreater = 10 > 5 
        val isLesser = 10 < 5 
        val isEqual = 10 == 10 
        val isNotEqual = 10 != 5 
        val andCondition = true && false 
        val orCondition = true || false
        
        sum shouldEqual 15 
        product shouldEqual 50 
        quotient shouldEqual 2 
        difference shouldEqual 5 
        isGreater shouldBe true 
        isLesser shouldBe false 
        isEqual shouldBe true 
        isNotEqual shouldBe true 
        andCondition shouldBe false 
        orCondition shouldBe true 
    }  
}
