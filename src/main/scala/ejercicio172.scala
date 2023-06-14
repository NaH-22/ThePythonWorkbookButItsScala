import java.util.Scanner
import scala.::
import scala.io.Source

object ejercicio172 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 172 #####")
    println("#########################")
    println("Programa de recursividad")
    val sc = new Scanner(System.in)
    val data = leerDatos()
    print("Coloque el nombre del elemento: ")
    val elemento = sc.nextLine()
    val elementos = secuenciaElementos(elemento,data)
    println(elementos)

//    data.foreach(x => println(x))
//    println(data.size)
  }

  def secuenciaElementos(palabraInicial: String, palabras: List[String]): List[String] = {
    if (palabraInicial == "") List()
    else {
      var secuenciaMejor: List[String] = List()
      val ultimaLetra = palabraInicial.last.toUpper
      val palabrasRestantes = palabras.filterNot(_ == palabraInicial)

      palabrasRestantes.foreach {x =>
        if (x.head.toUpper == ultimaLetra) {
          val candidato = secuenciaElementos(x, palabrasRestantes)
          if (candidato.size > secuenciaMejor.size) secuenciaMejor = candidato
        }
      }
      palabraInicial :: secuenciaMejor
    }
  }

  def leerDatos(): List[String] = {
    val file = Source.fromFile(System.getProperty("user.dir") + "/Elementos_tabla_periodica.csv")
    try {
      val filas = file.getLines().toList
      var resData: List[String] = List()
      filas.foreach { xcol =>
        val columna = xcol.split(",").map(_.trim)
        if (columna(1) != "Elemento") {
          resData = columna(2) :: resData
        }
      }
      return resData
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
