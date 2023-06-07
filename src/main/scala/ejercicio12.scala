import java.util.Scanner
import scala.math.{acos, sin, cos, toRadians}

object ejercicio12 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 12 #####")
    println("#########################")
    println("Calcula la distancia entre dos puntos de la tierra")
    val sc = new Scanner(System.in)
    print("Latitud punto 1: ")
    val xt1 = sc.nextLine()
    print("Longitud punto 1: ")
    val xg1  = sc.nextLine()
    print("Latitud punto 2: ")
    val xt2 = sc.nextLine()
    print("Longitud punto 2: ")
    val xg2 = sc.nextLine()

    val rxt1 = toRadians(xt1.toDouble)
    val rxt2 = toRadians(xt2.toDouble)
    val rxg1 = toRadians(xg1.toDouble)
    val rxg2 = toRadians(xg2.toDouble)

    val res = 6371.01  * acos((sin(rxt1)) * sin(rxt2) + cos(rxt1) * cos(rxt2) * cos(rxg1 - rxg2))
    println(s"Distancia entre los puntos: $res km!")
  }

}
