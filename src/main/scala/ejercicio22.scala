import java.util.Scanner
import scala.math.sqrt

object ejercicio22 {

  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 22 #####")
    println("#########################")
    println("Calcula el area de un triangulo con la longitud de sus lados")
    val sc = new Scanner(System.in)
    print("Longitud lado 1 (en cm): ")
    val l1 = sc.nextLine().toDouble
    print("Longitud lado 2 (en cm): ")
    val l2 = sc.nextLine().toDouble
    print("Longitud lado 3 (en cm): ")
    val l3 = sc.nextLine().toDouble
    val s = (l1 + l2 + l3) / 2

    val res = sqrt(s * (s - l1) * (s - l2) * (s - l3))
    println(s"Area del triangulo: $res cm^2")
  }


}
