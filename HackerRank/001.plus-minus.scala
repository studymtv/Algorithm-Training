object Solution {

    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
        val n = arr.size
        println("%.6f".formatLocal(Locale.ENGLISH, arr.count(_ > 0) / n.toDouble))
        println("%.6f".formatLocal(Locale.ENGLISH, arr.count(_ < 0) / n.toDouble))
        println("%.6f".formatLocal(Locale.ENGLISH, arr.count(_ == 0) / n.toDouble))
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}

