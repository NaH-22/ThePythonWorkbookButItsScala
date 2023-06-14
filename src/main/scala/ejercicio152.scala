import java.util.Scanner
import scala.io.Source

object ejercicio152 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 152 #####")
    println("#########################")
    println("Programa que lea un archivo con informacion de elementos quimicos y en base a eso el usuario pueda")
    println("poner un entero para buscar por numero de protones o String para buscar por nombre o simbolo")
    val sc = new Scanner(System.in)
    val data = leerDatos()
    print("Coloque el numero de protones, el nombre o simbolo del elemento: ")
    val search = sc.nextLine()
    try{
      val numKey = search.toInt
      val dataOption = data.get(numKey.toString)
      dataOption match {
        case Some(value) => println(s"Nombre del elemento: ${value.productElement(1)}, Simbolo : ${value.productElement(0)} y Numero de protones: $numKey ")
        case None => println(s"No se encontro ningun elemento con $numKey protones")
      }
    } catch {
      case ex: Exception =>{
        val strKey = data.find{case (_, valor) => search.equalsIgnoreCase(valor.productElement(0).toString)   || search.equalsIgnoreCase(valor.productElement(1).toString)} //(_._2.productElement(0) == search)
        strKey match {
          case Some((clave, valor)) => println(s"Nombre del elemento: ${valor.productElement(1)}, Simbolo : ${valor.productElement(0)} y Numero de protones: $clave ")
          case None => println(s"No se encontro ningun elemento llamado ni con el simbolo $search ")
        }

      }
    }
  }

  def leerDatos() : Map[String,(String,String)] = {
    val file = Source.fromFile(System.getProperty("user.dir")+"/Elementos_tabla_periodica.csv")
    try{
      val filas = file.getLines().toList
      var resData : Map[String,(String,String)] = Map()
      filas.foreach { xcol =>
        val columna = xcol.split(",").map(_.trim)
        if(columna(1) != "Elemento"){
          resData = resData + (columna(0) -> (columna(1),columna(2)))
        }
      }
      return resData
    } catch {
      case ex: Exception => {
        println(ex.getMessage)
        return Map()
      }
    } finally {
      file.close()
    }
  }

}
