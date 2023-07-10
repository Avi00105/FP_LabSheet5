object L5_1 {

  def checkPrime(n:Int ,d:Int=2):Boolean= {

    if( n <= 1 )
      false

    else if(d >= n)
      true

    else if(n % d == 0)
      false

    else
      checkPrime(n, d+1)
  }


  def main(args:Array[String]):Unit={

    val result=checkPrime(3);

    println(result)
  }

}
