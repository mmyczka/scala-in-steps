
# Step 3
## Scala Basics: Tests, Variables, Data Types, and Expressions
Welcome to step 3 of "Scala in Steps"! Today, we will explore Scala basics, including variables, data types, and expressions. As we go through these concepts, we will emphasize writing tests using the popular testing library ScalaTest.

### Create a New Scala Project
Before diving into Scala basics, let's create a new Scala project using the ScalaTest template:
1. Open a terminal or command prompt and navigate to the folder where you want to create your project.
2. Run the following command:
```shell
sbt new scala/scalatest-example.g8
```
3. When prompted, provide a name for your project, organization, and version. You can accept the default values if you prefer.
4. Once the project is generated, open it using your preferred IDE.

The basic project structure consists of two main folders:
* src/main: This folder contains the main source code for your Scala application. Inside, you will find a scala folder where your Scala classes and objects should be placed.
* src/test: This folder contains the test code for your Scala application. Inside, you will find a scala folder where your Scala test classes and objects should be placed.

Now that we have our project set up, let's learn Scala basics.

### Setting up ScalaTest
Now let's set up ScalaTest in your project:
1. Open the file build.sbt and add the following line of code if it does not already exist.
```scala
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
```

2. Refresh your project so that the dependency is downloaded and configured.

For more detailed information about ScalaTest, you can go to https://www.scalatest.org/, where you will find many resources about the framework.

### Writing Your First Test
Now that we have ScalaTest set up, let's write a simple test to demonstrate how it works. We will start with a test that checks the addition of two integers.
1. Create a new Scala class file named BasicOperationsTest in your test folder (usually located at src/test/scala).
2. Import the necessary ScalaTest components:
```scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
```
3. Define the test class by extending AnyFlatSpec and Matchers:
```scala
class BasicOperationsTest extends AnyFlatSpec with Matchers {
  "addition of 2 and 3" should "equal 5" in {
        val result = 2 + 3
        result shouldEqual 5
    }
}
```
4. Run the test using your IDE's built-in test runner. The test should pass.

Now, let's explore Scala basics.

### Variables
Scala has two types of variables: immutable (val) and mutable (var). Immutable variables cannot be changed once they are assigned a value, while mutable variables can be reassigned.
First, let's write a test for immutable variables:
```scala
"immutable variable" should "not be reassigned" in{
    val x = 10
    //x = 15 If you uncomment this line it should throw a compile-time error
    x should not equal 15
}
```
Next, write a test for mutable variables:
```scala 
"mutable variable" should "be reassigned" in {
    var y = 10
    y = 15
    y shouldEqual 15
}
```
#### Data Types
Scala has several basic data types, including Int, Double, Boolean, Char, and String. Let's write a test to demonstrate the correct assignment of these data types:
```scala 
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
```

### Expressions
Scala supports various arithmetic, relational, and logical expressions. Let's write a test to verify the correctness of these expressions:
```scala
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
```

By using ScalaTest, we have written tests for basic Scala concepts such as variables, data types, and expressions. Stay tuned for Step 4, where we will dive deeper into Scala's control structures, including conditionals and loops.

## Exercises
Evaluate the following expressions and store the results in appropriately named variables. Write tests to ensure that the results of these expressions are correct:

```scala 
1. 5 + 10
2. 8 - 20.
3. 6 * 7
4. 35 / 5
5. "Hello," + " World!"
6. 15 <= 15
7. 15 >= 20
8. 15 != 20
9. true && false
10. true || false
11. !true
```



