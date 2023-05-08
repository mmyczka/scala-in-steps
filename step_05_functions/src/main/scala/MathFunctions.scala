import scala.annotation.tailrec

object MathFunctions { 
	def add(a: Int, b: Int): Int = a + b

    def area(length: Double, width: Double): Double = length * width

    def totalCost(price: BigDecimal, taxRate: Double = 0.1): BigDecimal = price * (1 + taxRate)

    def factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)

    
    def tailFactorial(n: Int): Int = {
        @tailrec
        def loop(n: Int, acc: Int): Int = {
            if (n <= 1) acc
            else loop(n - 1, n * acc)
        }
        loop(n, 1)
    }
}