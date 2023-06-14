import java.util.Scanner
import scala.io.Source

object ejercicio162 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 162 #####")
    println("#########################")
    println("Programa que abre un archivo de texto y le da un formato")
    println("para que sus lineas tengan una longitud establecida")
    val sc = new Scanner(System.in)
    print("Coloque el nombre del archivo: ")
    val nameFile = sc.nextLine()
    print("Longitud: ")
    val longitud  = sc.nextInt()
    val texto = juntarStr(nameFile,longitud)

    texto.foreach(x => println(x))
    println()

  }

  def juntarStr(nameFile: String, longitud : Int): List[String] = {
    val file = Source.fromFile(System.getProperty("user.dir") + "/" + nameFile + ".txt")
    var stringFile = ""
    var stringCol = ""
    var listFile: List[String] = List()
    var cont = 0
    try {
      val numLinesFile = file.getLines().toList
      numLinesFile.foreach(x => stringFile += x.trim + " ")

      stringFile.foreach{x =>
        stringCol += x
        if ((x == ' ') && (stringCol.length > longitud)){
          listFile = listFile :+ stringCol
          stringCol = ""
        }
      }
      listFile = listFile :+ stringCol


      return listFile
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
