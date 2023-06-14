import java.util.Scanner

object ejercicio132 {

   def proceso(): Unit = {
     println("#########################")
     println("##### Ejercicio 132 #####")
     println("#########################")
     println("Crear un programa que lea un codigo postal y muestre la provincia asociada")
     println("con un diccionario(map) y si es zona urbana o rural")
     val postalCode = Map("A" -> "Newfoundland", "B" -> "Nova Scotia", "C" -> "Prince Edward Island", "E" -> "New Brunswick", "G" -> "Quebec", "H" -> "Quebec", "J" -> "Quebec",
     "K" -> "Ontario", "L" -> "Ontario", "M" -> "Ontario", "N" -> "Ontario", "P" -> "Ontario", "R" -> "Manitoba", "S" -> "Saskatchewan", "T" -> "Alberta", "V" -> "British Columbia",
       "X" -> "Nunavut ó Northwest Territories", "Y" -> "Yukon")
     val sc = new Scanner(System.in)
     var res = ""
     print("Coloque el codigo postal: ")
     val cp = sc.nextLine().trim

     if(postalCode.get(cp(0).toUpper.toString).toString != "None" ){
       res += "el codigo postal pertenece a la provincia " + postalCode(cp(0).toUpper.toString)
       if(cp(1) == '0')
         res += " y es zona rural"
       else
         res += " y es zona urbana"
     } else println("Codigo de provincia no valido")

     println(res)

   }

 }

