object L5_2 {
  def checkPrime(n: Int, d: Int = 2): Boolean = {

    if (n <= 1)
      false

    else if (d >= n)
      true

    else if (n % d == 0)
      false

    else
      checkPrime(n, d + 1)
  }

  def printSeq(n:Int,x:Int=2):Unit={
    //checking until meets the n
    if(x < n){

      if(checkPrime(x))

        println(x)

      printSeq(n,x+1)
    }
  }

  def main(args:Array[String]):Unit={

  val num=5

  println(s"prime sequence from 0 to $num:")

  printSeq(num)

  }

}
