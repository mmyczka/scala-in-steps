
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