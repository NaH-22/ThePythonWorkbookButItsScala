object Ejercicios {

  def ejecutar(x: Int): Unit = {
    x match {
      case 0   => println("Vuelvas prontos :D")
      case 1   => ejercicio1.proceso()
      case 2   => ejercicio2.proceso()
      case 12  => ejercicio12.proceso()
      case 22  => ejercicio22.proceso()
      case 32  => ejercicio32.proceso()
      case 42  => ejercicio42.proceso()
      case 52  => ejercicio52.proceso()
      case 62  => ejercicio62.proceso()
      case 72  => ejercicio72.proceso()
      case 82  => ejercicio82.proceso()
      case 92  => ejercicio92.proceso()
      case 102 => ejercicio102.proceso()
      case 112 => ejercicio112.proceso()
      case 122 => ejercicio122.proceso()
      case 132 => ejercicio132.proceso()
      case 142 => ejercicio142.proceso()
      case 152 => ejercicio152.proceso()
      case 162 => ejercicio162.proceso()
      case 172 => ejercicio172.proceso()
      case _   => println("Ejercicio no encontrado")
    }
  }

}
