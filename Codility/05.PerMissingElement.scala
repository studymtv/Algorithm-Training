object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.10
    if (a.isEmpty) {
      1
    } else {
      val max = a.length + 1
      val set = a.toSet
      (1 to max).find(!set.contains(_)).get
    }
  }
}
