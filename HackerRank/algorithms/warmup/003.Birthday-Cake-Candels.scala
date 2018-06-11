import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the birthdayCakeCandles function below.
    def birthdayCakeCandles(ar: Array[Int]): Int = {
        val max_value = ar.max
        val count_value = ar.count(_ == max_value)
        return count_value
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = birthdayCakeCandles(ar)

        printWriter.println(result)

        printWriter.close()
    }
}

