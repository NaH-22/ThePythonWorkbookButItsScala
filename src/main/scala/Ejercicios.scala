object Ejercicios {

  def ejecutar(x: Int): Unit = {
    x match {
      case 0 => println("Vuelvas prontos :D")
      case 1  => ejercicio1.proceso()
      case 2  => ejercicio2.proceso()
      case 12 => ejercicio12.proceso()
      case _ => println("Ejercicio no encontrado")
    }
  }

}
