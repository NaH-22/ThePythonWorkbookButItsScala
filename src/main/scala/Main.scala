import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {

    val sc = new Scanner(System.in)
    val ex = Ejercicios
    var ejercicio = 0

    do {

      print("Coloque el numero de ejercicio requerido o 0 para salir: ")
      ejercicio = sc.nextInt()
      ex.ejecutar(ejercicio)

    } while (ejercicio != 0)
  }
}
