import java.util.Scanner

object ejercicio52 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 52 #####")
    println("#########################")
    println("Convertir una calificiacion numeral a una de letras deacuerdo a una lista dada")
    val sc = new Scanner(System.in)
    val gp = Array(0,1.0,1.3,1.7,2.0,2.3,2.7,3.0,3.3,3.7,4.0)
    print("Calificacion numerica: ")
    val x = sc.nextDouble()

    if (x >= gp(0) && x < (gp(0)+gp(1))/2) println("Nota F")
    else if (x >= (gp(0)+gp(1))/2 && x < (gp(1)+gp(2))/2) println("Nota D")
    else if (x >= (gp(1)+gp(2))/2 && x < (gp(2)+gp(3))/2) println("Nota D+")
    else if (x >= (gp(2)+gp(3))/2 && x < (gp(3)+gp(4))/2) println("Nota C-")
    else if (x >= (gp(3)+gp(4))/2 && x < (gp(4)+gp(5))/2) println("Nota C")
    else if (x >= (gp(4)+gp(5))/2 && x < (gp(5)+gp(6))/2) println("Nota C+")
    else if (x >= (gp(5)+gp(6))/2 && x < (gp(6)+gp(7))/2) println("Nota B-")
    else if (x >= (gp(6)+gp(7))/2 && x < (gp(7)+gp(8))/2) println("Nota B")
    else if (x >= (gp(7)+gp(8))/2 && x < (gp(8)+gp(9))/2) println("Nota B+")
    else if (x >= (gp(8)+gp(9))/2 && x < (gp(9)+gp(10))/2) println("Nota A-")
    else if (x >= (gp(9)+gp(10))/2 && x < gp(10)) println("Nota A")
    else if (x >= gp(10)) println("Nota A+")

  }


}
