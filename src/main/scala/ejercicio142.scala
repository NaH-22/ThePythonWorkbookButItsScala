import java.util.Scanner
import scala.io.Source

object ejercicio142 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 142 #####")
    println("#########################")
    println("Leer las ultimas lineas de un archivo (tail)")
    val sc = new Scanner(System.in)
    print("Coloque el nombre del archivo: ")
    val nameFile = sc.nextLine()
    print("Coloque cuantas lineas desea leer: ")
    val numLines = sc.nextInt()
    val resList = funcionTail(nameFile,numLines)
    resList.foreach(x => println(x))

  }

  def funcionTail (nameFile : String, lines : Int) : List[String] = {
    val file = Source.fromFile(System.getProperty("user.dir")+"/"+nameFile+".txt")
    try {
      val numLinesFile = file.getLines().toList
      return numLinesFile.takeRight(lines)
    } catch {
      case ex: Exception => {
        println(ex.getMessage)
        return List()
      }
    } finally {
      file.close()
    }
  }

}
