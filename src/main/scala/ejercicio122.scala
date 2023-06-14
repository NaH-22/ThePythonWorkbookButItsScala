import java.util.Scanner

object ejercicio122 {
  def proceso(): Unit = {
    println("#########################")
    println("##### Ejercicio 122 #####")
    println("#########################")
    println("Tokenizar una expresion matematica")
    val sc = new Scanner(System.in)
    val fun = new ejerciciosFunciones()
    print("Coloque una expresion matematica: ")
    val listaTokenizada : List[String] = fun.tokenExpr(sc.nextLine())

    println(listaTokenizada)


  }

}
