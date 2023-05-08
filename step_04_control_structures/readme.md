
# Step 4
## Control Structures: Conditionals and Loops
Welcome to step 4 of "Scala in Steps"! Today, we will explore Scala's control structures, focusing on conditionals and loops.
### If-Else Conditionals
In Scala, if-else statements allow you to execute different code blocks based on whether a condition is true or false. Let's write a test for a simple if-else statement that checks if a number is even or odd:
```scala 
"even and odd numbers" should "be identified correctly" in {
    val number = 10
    val result = if (number % 2 == 0) "even" else "odd"
    result shouldEqual "even"
}
```
### Match Expressions
Match expressions in Scala are like switch statements in other languages but are more powerful and concise. Let's write a test for a match expression that maps numbers to their corresponding English words:
```scala
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
```
### While Loops
While loops in Scala allow you to execute a block of code repeatedly as long as a condition is true. Let's write a test for a simple while loop that calculates the sum of numbers from 1 to 5:
```scala 
"sum of numbers from 1 to 5" should "equal 15" in {
    var sum = 0
    var i = 1
    while (i <= 5) {
        sum += i
        i += 1
    }
    sum shouldEqual 15
}
```
### For Comprehensions
For comprehensions in Scala provide a more concise and readable way to work with collections, such as lists, arrays, or sets. Let's write a test for a for comprehension that generates a list of even numbers from a given list of integers:
```scala 
"even numbers from a list" should "be extracted correctly" in {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evens = for {
        number <- numbers if number % 2 == 0
    } yield number
    evens shouldEqual List(2, 4, 6, 8)
}
```
Now that we have explored various control structures in Scala, you should have a better understanding of how to write and test conditional statements and loops. 