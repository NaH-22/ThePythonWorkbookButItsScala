import java.util.Scanner

object ejercicio2 {

  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 2 ######")
    println("#########################")
    println("Te pide tu nombre y saluda :D")
    val sc = new Scanner(System.in)
    print("Coloque su nombre: ")
    val nombre = sc.nextLine()
    println(s"Hola $nombre!")
  }

}
