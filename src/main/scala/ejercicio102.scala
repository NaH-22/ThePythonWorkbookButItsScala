import java.util.Scanner

object ejercicio102 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 102 #####")
    println("#########################")
    println("Convierte una cantidad dada en la unidad mas grande posible")
    println("Unidades:")
    println("cuchara de te (te)")
    println("cuchara de mesa (me) = 3 cucharas de te")
    println("taza (tz) = 16 cucharas de mesa ")
    val sc = new Scanner(System.in)
    val fun = new ejerciciosFunciones()
    print("Coloque el numero y la unidad del ingrediente: ")
    val str = fun.reduceMeasures(sc.nextInt(),sc.nextLine())

    println(str)
  }

}
