object ejercicio62 {
  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 62 #####")
    println("#########################")
    println("Programa que con un loop cree una tabla con el precio original,")
    println("el descuento(60%) y el precio final de una lista de precios")
    val purchases: Array[BigDecimal] = Array(4.95, 9.95, 14.95, 19.95, 24.95)
    println("Original|  Desc  |  Final ")
    purchases.foreach(x => println( ("$"+(x.setScale(2,BigDecimal.RoundingMode.HALF_UP))).padTo(10,' ')+
      ("$"+(x*0.60).setScale(2,BigDecimal.RoundingMode.HALF_UP)).padTo(10,' ')+
      ("$"+(x*0.40).setScale(2,BigDecimal.RoundingMode.HALF_UP)).padTo(10,' ') ))
  }

}
