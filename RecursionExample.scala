object Main extends App {
  def mDecRecursive(s: String): Int = {
    if (s.length == 1) {
      println(s"Mdec(<$s>) = $s")
      s.toInt
    } else {
      val prefix = s.substring(0, s.length - 1)
      val lastDigit = s.charAt(s.length - 1)

      val subResult = mDecRecursive(prefix)
      val result = 10 * subResult + Character.getNumericValue(lastDigit)

      println(s"Mdec(<$prefix> '$lastDigit') = 10 * Mdec(<$prefix>) + $lastDigit = $result")
      result
    }
  }

  println("Digite um número: ")
  val number = scala.io.StdIn.readLine()

  val result = mDecRecursive(number)
  println(s"Final result: $result")
}
