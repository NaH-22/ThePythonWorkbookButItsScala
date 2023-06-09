import java.util.Scanner

object ejercicio42 {

  def proceso(): Unit = {
    println("#########################")
    println("###### Ejercicio 42 #####")
    println("#########################")
    println("Convertir una frecuencia con un rango alrededor de 1 a una nota con una lista dada")
    val xfr = Array(1.00,261.63,293.66,329.63,349.23,392.00,440.00,493.88)
    val sc = new Scanner(System.in)
    print("Coloque la Frequencia (Hz):")
    val xinput = sc.nextDouble();


    if (xinput >= (xfr(1)-xfr(0)) && xinput <= (xfr(1)+xfr(0))) println("Nota: C4")
    else if (xinput >= (xfr(2)-xfr(0)) && xinput <= (xfr(2)+xfr(0))) println("Nota: D4")
    else if (xinput >= (xfr(3)-xfr(0)) && xinput <= (xfr(3)+xfr(0))) println("Nota: E4")
    else if (xinput >= (xfr(4)-xfr(0)) && xinput <= (xfr(4)+xfr(0))) println("Nota: F4")
    else if (xinput >= (xfr(5)-xfr(0)) && xinput <= (xfr(5)+xfr(0))) println("Nota: G4")
    else if (xinput >= (xfr(6)-xfr(0)) && xinput <= (xfr(6)+xfr(0))) println("Nota: A4")
    else if (xinput >= (xfr(7)-xfr(0)) && xinput <= (xfr(7)+xfr(0))) println("Nota: B4")
    else println("La frecuencia dada no corresponde a una nota conocida.")
  }

}
