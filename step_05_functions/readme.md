# Step 5
## Functions and Methods
Welcome to step 5 of "Scala in Steps"! Today, we will explore functions and methods in Scala. Functions and methods are the building blocks of your code, allowing you to create reusable pieces of logic.
### Defining Functions
In Scala, functions are defined using the def keyword, followed by the function name, parameters, return type, and the function body. Let's write a test for a simple function that adds two integers:
```scala
"addition function" should "return the correct sum" in {
  val result = MathFunctions.add(3, 4)
  result shouldEqual 7
}
```
In src/main/scala, create a new file named MathFunctions.scala and add the following object with function:
```scala
object MathFunctions { 
	def add(a: Int, b: Int): Int = a + b
}
```
 
### Function Parameters
Functions can accept multiple parameters of various types. Let's write a test for a function that calculates the area of a rectangle given its length and width:
```scala
"area function" should "return the correct area" in { 
	val result = MathFunctions.area(5.0, 3.0) 
	result shouldEqual 15.0 
}
```
```scala
 def area(length: Double, width: Double): Double = length * width
```
### Default Parameter Values
Scala allows you to provide default values for function parameters. Let's write a test for a function that calculates the total cost of an item, including tax, with a default tax rate of 10%:
```scala
"total cost function" should "return the correct cost" in {
	val result1 = MathFunctions.totalCost(100.0) 
	val result2 = MathFunctions.totalCost(100.0, 0.2)

	result1 shouldEqual 110.0 
	result2 shouldEqual 120.0 
}
```
```scala
def totalCost(price: BigDecimal, taxRate: Double = 0.1): BigDecimal = price * (1 + taxRate)
```
### Recursive Functions
Recursive functions are functions that call themselves to solve a problem. Let's write a test for a recursive function that calculates the factorial of a non-negative integer:
```scala
"factorial function" should "return the correct factorial" in { 
	val result = MathFunctions.factorial(5) 
	result shouldEqual 120 
}
```
```scala
def factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)
```

### Tail-Recursive Functions

A tail-recursive function is a function where the recursive call is the last operation in the function. Scala can optimize tail-recursive functions, converting them into loops, which reduces the risk of stack overflow errors.

Let's write a test for a tail-recursive function that calculates the factorial of a non-negative integer:

```scala 
"tail-recursive factorial function" should "return the correct factorial" in {
    val result = MathFunctions.tailFactorial(5)
    result shouldEqual 120
}
```
Now, let's implement the tail-recursive function in src/main/scala/MathFunctions.scala:

``` scala 
import scala.annotation.tailrec

object MathFunctions {
// ...

    def tailFactorial(n: Int): Int = {
        @tailrec
        def loop(n: Int, acc: Int): Int = {
            if (n <= 1) acc
            else loop(n - 1, n * acc)
        }
        loop(n, 1)
    }
}
```
In this example, we use the @tailrec annotation to ensure that the loop function is tail-recursive. If the function is not tail-recursive, the Scala compiler will throw an error at compile time.

Rerun the tests to ensure that the tail-recursive function passes the test.

By incorporating tail recursion into your recursive functions, you can improve the performance and reliability of your code.


## Exercises

1. Write a function named multiply that takes two integers and returns their product.


2. Write a function named distance that calculates the distance between two points in a two-dimensional plane, given their coordinates as (x1, y1) and (x2, y2). Use the following formula for the distance calculation: sqrt((x2 - x1)^2 + (y2 - y1)^2).


3. Write a tail-recursive function named fibonacci that calculates the nth Fibonacci number, where fibonacci(0) = 0, fibonacci(1) = 1, and fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2) for n > 1.


4. Create a class named BankAccount with methods deposit, withdraw, and balance. Write tests for these methods to ensure that depositing and withdrawing money works correctly, and that the balance is updated accordingly.


5. Write a function named volume that calculates the volume of a cylinder, given its radius and height. Use the following formula for the volume calculation: π * radius^2 * height. 

Complete these exercises to practice writing tests and implementing functions and methods 