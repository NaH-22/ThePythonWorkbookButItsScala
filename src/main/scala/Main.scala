import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {

    val sc = new Scanner(System.in)
    val ex = Ejercicios
    var ejercicio = ""

    do {
      print("Coloque el numero de ejercicio requerido o 0 para salir: ")
      ejercicio = sc.nextLine()
      try {
        ex.ejecutar(ejercicio.toInt)
      } catch {
        case ex: Exception => {
          println(ex.getMessage)
        }
      }
    } while (ejercicio != "0")



  }
}
