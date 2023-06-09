import java.util.Scanner

object ejercicio82 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 82 #####")
    println("#########################")
    println("Calcular el total de la cuenta de un taxi usando una funcion")
    val sc = new Scanner(System.in)
    print("Coloque la distancia recorrida(km) en el taxi: ")
    val x = sc.nextBigDecimal()

    println("Total: $" + calcTotal(x))
  }

  def calcTotal(x : BigDecimal) : BigDecimal = {
    val total : BigDecimal = (x/0.140)*0.25 + 4
    return total.setScale(4,BigDecimal.RoundingMode.HALF_UP)
  }

}
