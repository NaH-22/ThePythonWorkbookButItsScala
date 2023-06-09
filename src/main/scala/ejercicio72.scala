import java.util.Scanner

object ejercicio72 {

  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 72 #####")
    println("#########################")
    println("Verificar si una cadena es palindromo por medio de loops")
    val sc = new Scanner(System.in)
    print("Coloque un palindromo: ")
    val x = sc.nextLine()
    var rx : String = ""

    for (i <- 1 to x.length){
      rx += x(x.length-i)
    }

    if (x.compareToIgnoreCase(rx) == 0)
      println("Es un palindromo :D")
    else
      println("No es un palindromo >:c")

    println(s"Cadena invertida: $rx")

  }

}
