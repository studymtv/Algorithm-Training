import java.io.PrintWriter

object Solution {
    def timeConversion(s: String): String = {
        val hours = s.substring(0, s.indexOf(":")).toInt
        val minutes = s.substring(s.indexOf(":") + 1, s.lastIndexOf(":")).toInt
        val seconds = s.substring((s.lastIndexOf(":")) + 1, (s.lastIndexOf(":")) + 3).toInt
        
        val newHours = if (hours == 12) 0 else hours
        val pmChange = if(s.toLowerCase.contains("pm")) 12 else 0
        
        val result = "%02d:%02d:%02d".format((newHours + pmChange), minutes, seconds)
        return result
    }
    

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = scan.readLine

        val result = timeConversion(s)

        fw.println(result)

        fw.close()
    }
}

