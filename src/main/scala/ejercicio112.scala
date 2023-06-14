import java.util.Scanner

object ejercicio112 {

  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 112 #####")
    println("#########################")
    println("Escriba un programa que lea números del usuario hasta que se ingrese una línea en blanco")
    println("debe mostrar el promedio, los valores por debajo y por encima del promedio")
    val sc = new Scanner(System.in)
    var lista : List[Double] = List()
    var num : String = ""


    do {
      print("Ingrese valor No."+(lista.length + 1)+": ")
      num = sc.nextLine()
      if (num != "")
        lista = lista :+ num.toDouble
    } while (num != "")

    val prom = lista.sum / lista.length
    println(s"Promedio: $prom")
    println("Valores por encima del promedio: " + lista.filter(_ > prom))
    println("Valores iguales al promedio: " + lista.filter(_ == prom))
    println("Valores por abajo del promedio: " + lista.filter(_ < prom))
    println("Lista total: "+ lista)





  }

}
