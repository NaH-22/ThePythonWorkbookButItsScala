import java.util.Scanner

object ejercicio92 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 92 #####")
    println("#########################")
    println("Programa checa si un numero es primo con una funcion")
    val sc = new Scanner(System.in)
    val fun = new ejerciciosFunciones()
    print("Coloque un numero entero:")
    val primo = fun.numerosPrimos(sc.nextInt())

    println("Es primo: " + primo)



  }

}
