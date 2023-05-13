# Step 6
## Higher-Order Functions and Anonymous Functions
Welcome to Step 6 of "Scala in Steps"! Today, we are going to explore higher-order functions and anonymous functions in Scala. Higher-order functions are functions that take other functions as parameters or return functions as results. Anonymous functions, also known as function literals or lambda functions, are functions defined without a name.
### Write Tests for Higher-Order Functions
Let's start by writing tests for a higher-order function that applies a given function to an integer. In src/test/scala, create a new file named HigherOrderFunctionTest.scala and add the following tests:
```scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HigherOrderFunctionTest extends AnyFlatSpec with Matchers {
    "A higher-order function" should "correctly apply the provided function to an integer" in {
    val result1 = MathFunctions.applyFunction(_ * 2, 5)
    val result2 = MathFunctions.applyFunction(_ + 10, 7)

        result1 shouldEqual 10
        result2 shouldEqual 17
    }
}
```
Now, run the tests to see them fail initially, as we haven't yet implemented the applyFunction method.
### Implement Higher-Order Function
In src/main/scala/MathFunctions.scala, add the following higher-order function:
'''scala
def applyFunction(f: Int => Int, x: Int): Int = f(x)
'''
### Write Tests for Anonymous Functions
Next, let's write tests for an anonymous function that adds a given number to another number. Add the following test in HigherOrderFunctionTest.scala:
'''scala
"A function" should "correctly add a given number to another number" in {
val addFive = (x: Int) => x + 5
val result = MathFunctions.applyFunction(addFive, 10)

result shouldEqual 15
}
'''
Step 4: Rerun Tests
Finally, rerun the tests. This time, they should pass, as we've correctly implemented the higher-order function and anonymous function.
By following the TDD approach, you can ensure that your higher-order functions and anonymous functions are working as expected, making your code more robust and reliable.