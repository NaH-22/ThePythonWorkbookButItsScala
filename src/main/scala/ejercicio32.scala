import java.util.Scanner
import scala.math.{min,max}

object ejercicio32 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 32 #####")
    println("#########################")
    println("Leer 3 enteros y ordenarlos de menor a mayor")
    val sc = new Scanner(System.in)
    print("Entero no.1: ")
    val n1 = sc.nextLine().toInt
    print("Entero no.2: ")
    val n2 = sc.nextLine().toInt
    print("Entero no.3: ")
    val n3 = sc.nextLine().toInt

    val res = List(min(min(n1,n2),min(n1,n3)),min(max(n1,n2),max(n1,n3)),max(max(n1,n2),max(n1,n3)))
    println(res)
  }
}