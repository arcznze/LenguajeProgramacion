import scala.io.Source
import scala.io.StdIn.readLine
object Main extends App{
  println("Hello World!")

  println(Sum(22,11))

  println("Enter a name:")
        val name = scala.io.StdIn.readLine()
        println(name)

  throw new Exception("Error :C")

  println(System.getProperty("user.home"))

  val filename = "C://Users//laona//Downloads//ToDoList.txt"
  for(lines <- Source.fromFile(filename).getLines){
    println(lines)
  }

  def Sum(a:Int ,b:Int):Int = {
    var sum:Int = a + b
    return sum
  }
}