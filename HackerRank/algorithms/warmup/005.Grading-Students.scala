import java.io.PrintWriter

object Solution {

    /*
     * Complete the gradingStudents function below.
     */
    def gradingStudents(grades: Array[Int]): Array[Int] = {
        /*
         * Write your code here.
         */
        val finalGrades = grades.map(professorGradeRule)
        println(finalGrades)

        finalGrades.foreach{println}
    }    
        
    def professorGradeRule(grade: Int): Int = {
        val multiply5 = grade / 5
        val roundBy5 = if(grade % 5 == 0) multiply5 * 5 else (multiply5 + 1) * 5
        if(roundBy5 - grade < 3 && grade >= 38) roundBy5 else grade
      }

    

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = scan.readLine.trim.toInt

        val grades = Array.ofDim[Int](n)

        for (gradesItr <- 0 until n) {
            val gradesItem = scan.readLine.trim.toInt
            grades(gradesItr) = gradesItem}

        val result = gradingStudents(grades)

        fw.println(result.mkString("\n"))

        fw.close()
    }
}

