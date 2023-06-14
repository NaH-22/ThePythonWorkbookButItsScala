
class ejerciciosFunciones {

  def numerosPrimos(x : Int): Boolean = {
    var res = false
    var cont : Int = 0
    for (i <- 1 to x) {
      if (x%i == 0)
        cont+= 1
    }

    if (cont <= 2)
      res = true

    return res
  }


  def reduceMeasures(x: Int, u : String): String = {
    var cantidad : Int = 0
    val unidad = u.trim
    println("x:"+x+"u:"+u+"unidad"+unidad)
    if(unidad == "cuchara de te" || unidad == "te")
      cantidad = x
    else if(unidad == "cuchara de mesa" || unidad == "me")
      cantidad = x * 3
    else if(unidad == "taza" || unidad == "tz")
      cantidad = x * 48
    else
      return "Unidad no valida"

    val taza : Int = cantidad/48
    val mesa : Int = (cantidad-(taza*48))/3
    val te   : Int = cantidad-(mesa*3)-(taza*48)

    return s"$taza tazas, $mesa cucharas de mesa y $te cucharas de te"
  }


  def tokenExpr(s : String): List[String] = {
    var tokenString = s.replace(" ","")
    var tokenList : List[String] = List()
    var contador = 0
    var num = ""

    while(contador < tokenString.length){
      if(tokenString(contador) == '*' || tokenString(contador) == '/' || tokenString(contador) == '/' || tokenString(contador) == '^' || tokenString(contador) == '(' || tokenString(contador) == ')'){
        tokenList = tokenList :+ tokenString(contador).toString
        contador += 1
      } else if (tokenString(contador) == '+' || tokenString(contador) == '-'){
        if (contador > 0 && (tokenString(contador-1) >= '0' && tokenString(contador-1) <= '9' || tokenString(contador-1) == ')' ) ){
          tokenList = tokenList :+ tokenString(contador).toString
          contador += 1
        } else{
          num = tokenString(contador).toString
          contador += 1
          while (contador < tokenString.length && tokenString(contador) >= '0' && tokenString(contador) <= '9'){
            num = num +  tokenString(contador).toString
            contador += 1
          }
          tokenList = tokenList :+ num
        }
      }else if (tokenString(contador) >= '0' &&  tokenString(contador) <= '9') {
        num= ""
        while (contador < tokenString.length && tokenString(contador) >= '0' && tokenString(contador) <= '9') {
          num = num + tokenString(contador).toString
          contador += 1
        }
        tokenList = tokenList :+ num
      } else return List()
    }
    return tokenList
  }


}
